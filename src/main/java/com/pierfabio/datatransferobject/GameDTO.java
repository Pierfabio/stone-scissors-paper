package com.pierfabio.datatransferobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pierfabio.domainvalue.Move;
import lombok.Getter;

@Getter
public class GameDTO {

    @JsonProperty("userMove")
    private Move userMove;

    @JsonProperty("AIMove")
    private Move AIMove;

}
