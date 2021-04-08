package com.edjeffreys.pokerface.reporting.controller;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import com.edjeffreys.pokerface.reporting.model.Game;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("api/v1/game")
public interface GameResource {

  @POST
  @Consumes(APPLICATION_JSON)
  public void create(Game game);

}
