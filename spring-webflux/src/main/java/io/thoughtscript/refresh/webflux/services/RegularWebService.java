package io.thoughtscript.refresh.webflux.services;

import org.springframework.stereotype.Service;

import io.thoughtscript.refresh.webflux.dtos.CustomResponse;
import io.thoughtscript.refresh.webflux.Constants;

@Service
public class RegularWebService {

  public CustomResponse example() {
    try {
      return new CustomResponse(0, Constants.DEFAULT_GREETING);
    } catch (Exception ex) {
      return new CustomResponse(0, Constants.DEFAULT_ERROR);
    }
  }
}
