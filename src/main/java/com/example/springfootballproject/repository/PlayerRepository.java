package com.example.springfootballproject.repository;

import com.example.springfootballproject.model.Player;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;


public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findByFirstName(String firstName);
    Player findFirstByOrderByLastNameAsc();
    void deleteById(Long id);
}
