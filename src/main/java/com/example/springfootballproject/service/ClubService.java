package com.example.springfootballproject.service;

import com.example.springfootballproject.model.Club;

import java.util.List;

public interface ClubService {
    List<Club> findAllByLeague(String league);

    Club findFirstById(Long id);

    Club findClubsByNickName(String nickName);

    Club findClubByName(String name);
}
