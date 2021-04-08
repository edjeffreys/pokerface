package com.edjeffreys.pokerface.reporting.config;

import com.edjeffreys.pokerface.reporting.controller.GameService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(GameService.class);
  }

}
