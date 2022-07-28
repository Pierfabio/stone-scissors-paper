package com.pierfabio.controller;

import com.pierfabio.datatransferobject.GameDTO;
import com.pierfabio.domainvalue.RoundResult;
import com.pierfabio.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("game")
public class GameController {

    private final GameService service;

    @Autowired
    public GameController(GameService service) {
        this.service = service;
    }

    @PostMapping("/round")
    @ResponseStatus(HttpStatus.OK)
    public RoundResult checkRound(@RequestBody GameDTO gameDTO) {
        return service.checkRound(gameDTO);
    }

}
