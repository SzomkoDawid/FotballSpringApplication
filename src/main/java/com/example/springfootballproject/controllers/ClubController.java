package com.example.springfootballproject.controllers;

import com.example.springfootballproject.model.Club;
import com.example.springfootballproject.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
public class ClubController {
    private ClubService clubService;
    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }
    @GetMapping("{league}")
    @ResponseBody
    public List<Club> findAllByLeague(@PathVariable  String league){
        return clubService.findAllByLeague(league);
    }
}
