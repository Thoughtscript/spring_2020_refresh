package io.thoughtscript.refresh.webflux.services;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import io.thoughtscript.refresh.webflux.dtos.CustomResponse;
import io.thoughtscript.refresh.webflux.Constants;

public class FunctionalRouterWebHandler {

  public Mono<ServerResponse> example(ServerRequest request) {
    try {
      CustomResponse r = new CustomResponse(0, Constants.DEFAULT_GREETING);
      return ServerResponse.ok().body(Mono.just(r), CustomResponse.class);
    } catch (Exception ex) {
      CustomResponse r = new CustomResponse(0, Constants.DEFAULT_ERROR);
      return ServerResponse.ok().body(Mono.just(r), CustomResponse.class);
    }
  }
}
