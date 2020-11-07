package io.thoughtscript.refresh.webflux.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import io.thoughtscript.refresh.webflux.dtos.CustomResponse;
import io.thoughtscript.refresh.webflux.Constants;

@Service
public class ReactiveWebService {

  public Mono<CustomResponse> example() {
    try {
      return Mono.just(new CustomResponse(0, Constants.DEFAULT_GREETING));
    } catch (Exception ex) {
      return Mono.just(new CustomResponse(0, Constants.DEFAULT_ERROR));
    }
  }
}
