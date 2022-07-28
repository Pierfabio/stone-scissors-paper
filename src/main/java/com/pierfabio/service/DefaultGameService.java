package com.pierfabio.service;

import com.pierfabio.datatransferobject.GameDTO;
import com.pierfabio.domainvalue.Move;
import com.pierfabio.domainvalue.RoundResult;
import org.springframework.stereotype.Service;

@Service
public class DefaultGameService implements GameService {

    @Override
    public RoundResult checkRound(GameDTO gameDTO) {
        return checkMove(gameDTO);
    }

    private RoundResult checkMove(GameDTO gameDTO){

        if(gameDTO.getUserMove().equals(gameDTO.getAIMove())) {
            return RoundResult.DRAW;
        }

        if(gameDTO.getUserMove().equals(Move.STONE) && gameDTO.getAIMove().equals(Move.SCISSORS) ||
           gameDTO.getUserMove().equals(Move.SCISSORS) && gameDTO.getAIMove().equals(Move.PAPER) ||
           gameDTO.getUserMove().equals(Move.PAPER) && gameDTO.getAIMove().equals(Move.STONE)
        ) {
            return RoundResult.WIN;
        }

        return RoundResult.LOSE;

    }
}
