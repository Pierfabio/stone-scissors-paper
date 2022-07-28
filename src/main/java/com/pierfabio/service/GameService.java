package com.pierfabio.service;

import com.pierfabio.datatransferobject.GameDTO;
import com.pierfabio.domainvalue.RoundResult;

public interface GameService {

    RoundResult checkRound(GameDTO gameDTO);

}
