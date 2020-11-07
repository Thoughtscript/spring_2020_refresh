package io.thoughtscript.refresh.webflux.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import io.thoughtscript.refresh.webflux.Constants;
import io.thoughtscript.refresh.webflux.dtos.CustomResponse;
import io.thoughtscript.refresh.webflux.services.ReactiveWebService;

@RestController
public class ReactiveRestController {

    @Autowired
    ReactiveWebService reactiveWebService;

    @GetMapping(Constants.REACTIVE_REST_URL)
    public Mono<CustomResponse> getSession() {
        return reactiveWebService.example();
    }
}
