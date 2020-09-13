package io.thoughtscript.refresh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity getOkController() {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/name")
    @ResponseBody
    public String getNameController(@RequestParam String name) {
        return "Hello " + name;
    }
}
