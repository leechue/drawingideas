package com.dev.drawingideas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drawing")
public class DrawingControllerApi {

    @GetMapping("/getideas/{text}")
    public String getIdeas(@PathVariable String text) {
        System.out.println("Your idea is :" + text);
        System.out.println("Exit");
        return text;
    }
}
