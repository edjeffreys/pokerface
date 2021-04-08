package com.edjeffreys.pokerface.reporting.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import org.springframework.data.annotation.Id;

public record Game(
    @JsonIgnore @Id Long id,
    @JsonProperty("gameUid") UUID gameUid,
    @JsonProperty("date") Date date,
    @JsonProperty("buyInAmount)") BigDecimal buyInAmount) { }
