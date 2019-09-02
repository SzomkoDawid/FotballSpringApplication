package com.example.springfootballproject.repository;

import com.example.springfootballproject.model.Club;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ClubRepository extends CrudRepository<Club, Long> {
    List<Club> findAllByLeague(String league);
    Club findFirstById(Long id);
    Club findClubsByNickName(String nickName);
    Club findClubByName(String name);
}
