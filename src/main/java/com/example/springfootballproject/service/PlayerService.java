package com.example.springfootballproject.service;

import com.example.springfootballproject.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    List<Player> findByFirstName(String firstName);

    Player findFirstByOrderByLastNameAsc();

    List<Player> findAll();

    Player addPlayer(Player player);

    void deleteById(Long id);

}
