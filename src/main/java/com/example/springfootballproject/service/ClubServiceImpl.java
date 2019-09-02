package com.example.springfootballproject.service;
import com.example.springfootballproject.model.Club;
import com.example.springfootballproject.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public List<Club> findAllByLeague(String league) {
        return clubRepository.findAllByLeague(league);
    }
    public Club findFirstById(Long id) {
        return clubRepository.findFirstById(id);
    }
    public Club findClubsByNickName(String nickName) {
        return clubRepository.findClubsByNickName(nickName);
    }
    public Club findClubByName(String name) {
        return clubRepository.findClubByName(name);
    }
}
