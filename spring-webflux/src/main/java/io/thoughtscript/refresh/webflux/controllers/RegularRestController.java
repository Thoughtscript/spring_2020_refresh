package io.thoughtscript.refresh.webflux.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.thoughtscript.refresh.webflux.Constants;
import io.thoughtscript.refresh.webflux.dtos.CustomResponse;
import io.thoughtscript.refresh.webflux.services.RegularWebService;

@RestController
public class RegularRestController {

    @Autowired
    RegularWebService regularWebService;

    @GetMapping(Constants.REGULAR_REST_URL)
    public CustomResponse getSession() {
        return regularWebService.example();
    }
}
