package com.edjeffreys.pokerface.reporting.controller;

import com.edjeffreys.pokerface.reporting.model.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GameService implements GameResource {

  private static final Logger logger = LoggerFactory.getLogger(GameService.class);

  @Override
  public void create(Game game) {
    // TODO
  }
}
