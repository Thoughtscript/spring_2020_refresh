package io.thoughtscript.refresh.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import io.thoughtscript.refresh.services.ExampleWebService;
import io.thoughtscript.refresh.dtos.CustomResponse;
import io.thoughtscript.refresh.Constants;

@Controller
@RequestMapping(Constants.REST_API_ENDPOINT)
public class ExampleController {

    @Autowired
    ExampleWebService exampleWebService;

    @GetMapping(Constants.STATUS_ENDPOINT)
    @ResponseBody
    public ResponseEntity getOkController() {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping(Constants.REQUEST_RESPONSE_ENDPOINT)
    @ResponseBody
    public String getNameController(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping(Constants.WEB_SERVICE_ENDPOINT)
    @ResponseBody
    public CustomResponse getSession() {
        return exampleWebService.example();
    }
}
