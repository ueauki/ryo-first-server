package com.example.ryofirstserver.controller;

import com.example.ryofirstserver.service.KakaoApiService;
import com.example.ryofirstserver.util.ApiUtills;
import org.springframework.beans.factory.annotation.Autowired;
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
