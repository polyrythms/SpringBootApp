package ru.denis.springcourse.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    @Value("${hello}")
    private String hello;

}
