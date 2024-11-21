package org.example.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private static final Logger log = LoggerFactory.getLogger(FirstController.class);

    @GetMapping("/")
    public String add() {
        log.info("/ is open");
        return "ss is ok";
    }
}
