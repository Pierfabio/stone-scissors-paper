package com.pierfabio.domainvalue;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Move {

    @JsonProperty("stone")
    STONE,
    @JsonProperty("scissors")
    SCISSORS,
    @JsonProperty("paper")
    PAPER;

}
