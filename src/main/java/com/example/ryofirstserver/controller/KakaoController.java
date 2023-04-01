package com.example.schedulerserver.controller;

import com.example.schedulerserver.service.KakaoApiService;
import com.example.schedulerserver.util.ApiUtills;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kakao")
public class KakaoController {

    @Autowired
    private ApiUtills apiUtills;

    @Autowired
    private KakaoApiService kakaoApiService;

    @GetMapping("/test")
    public String getTest() {
        return "gggg";
    }

    @PostMapping("/messages")
    public String postMessages(@RequestParam String email) {

        return null;
    }
}
