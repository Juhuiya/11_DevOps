package com.ohgiraffers.dockerimage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("docker")
    public String docker() {
        return "🐋Hello Docker🐋";
    }

}
