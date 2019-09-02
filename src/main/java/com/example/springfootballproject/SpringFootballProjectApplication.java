package com.example.springfootballproject;

import com.example.springfootballproject.model.Club;
import com.example.springfootballproject.model.Player;
import com.example.springfootballproject.repository.ClubRepository;
import com.example.springfootballproject.service.ClubService;
import com.example.springfootballproject.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import java.util.*;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.springfootballproject.repository")
public class SpringFootballProjectApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringFootballProjectApplication.class);

    @Autowired
    private PlayerService playerService;
    @Autowired
    private ClubService clubService;
    @Autowired
    private ClubRepository clubRepository;
    @Autowired
    private WebSecurityConfig webSecurityConfig;
    public static void main(String[] args) {
        logger.debug("STARTING SPRING BOOT APPLICATION");
        SpringApplication.run(SpringFootballProjectApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        // Query - all clubs from Premier League
        String league = "Premier League";
        List<Club> foundClubsByLeague = clubService.findAllByLeague(league);
        logger.info("All clubs from Premier League - " + foundClubsByLeague);

        // Query - all info about player whose firstname is Cristiano
        String firstName = "Cristiano";
        List<Player> foundByFirstName = playerService.findByFirstName(firstName);
        logger.info("Info about player - " + foundByFirstName);

        // Query - all info about the club whose id's first
        long id = 1;
        Club foundById = clubService.findFirstById(id);
        logger.info("First team is - " + foundById);

        // Query - player who's first in ASC order by lastname
        logger.info("First player in order by LastName - " + playerService.findFirstByOrderByLastNameAsc());

        // Update - change incorrect club nickname
        logger.debug("CHANGE BAD NICKNAME FOR JUVENTUS");
        Club club = clubService.findClubsByNickName("white lady");
        club.setNickName("White Lady");
        clubRepository.save(club);
        logger.info("DONE");

        // Query - iterate for all clubs
        Iterable<Club> clubs = clubRepository.findAll();
        logger.info("All clubs: " + clubs);
    }
}
