package com.example.springfootballproject.service;

import com.example.springfootballproject.model.Player;
import com.example.springfootballproject.repository.ClubRepository;
import com.example.springfootballproject.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {
    private PlayerRepository playerRepository;
    private ClubRepository clubRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository, ClubRepository clubRepository) {
        this.playerRepository = playerRepository;
        this.clubRepository = clubRepository;
    }

    public List<Player> findByFirstName(String firstName) {
        return playerRepository.findByFirstName(firstName);
    }

    public Player findFirstByOrderByLastNameAsc() {
        return playerRepository.findFirstByOrderByLastNameAsc();
    }

    public List<Player> findAll() {
        List<Player> list = new ArrayList<>();
        playerRepository.findAll().forEach(list::add);
        return list;
    }
    @Transactional
    public Player addPlayer(Player player) {
        clubRepository.save(player.getClub());
        return playerRepository.save(player);
    }
    public void deleteById(Long id) {
        playerRepository.deleteById(id);
    }
}
