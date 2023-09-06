package com.example.springboot3logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BaseController {


    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @GetMapping("get-data")
    public void getData() {
        logger.info("get data");

    }
}
