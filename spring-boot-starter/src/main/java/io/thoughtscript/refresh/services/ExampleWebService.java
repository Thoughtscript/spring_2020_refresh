package io.thoughtscript.refresh.services;

import org.springframework.stereotype.Service;

import io.thoughtscript.refresh.dtos.CustomResponse;
import io.thoughtscript.refresh.Constants;

@Service
public class ExampleWebService {
  public CustomResponse example() {
    try {
      return new CustomResponse(0, Constants.DEFAULT_GREETING);
    } catch (Exception ex) {
      return new CustomResponse(0, Constants.DEFAULT_ERROR);
    }
  }
}
