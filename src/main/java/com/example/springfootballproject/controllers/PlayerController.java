package com.example.springfootballproject.controllers;
import com.example.springfootballproject.model.Player;
import com.example.springfootballproject.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlayerController {
    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping({"/players", "players"})
    public String getAllusers(Model model) {
        model.addAttribute("playerList", playerService.findAll());
        model.addAttribute("player", new Player());
        return "players";
    }

    @PostMapping("/players")
    public String addPlayer(Model model, @ModelAttribute Player player) {
        model.addAttribute(playerService.addPlayer(player));
        return "redirect:players";
    }
    @RequestMapping(value="/deleteemp/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id){
        playerService.deleteById(id);
        return "redirect:/players";
    }
}
