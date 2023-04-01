package com.example.ryofirstserver.controller;

import com.example.ryofirstserver.service.KakaoApiService;
import com.example.ryofirstserver.util.ApiUtills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/google")
public class GoogleController {

    @Autowired
    private ApiUtills apiUtills;

    @PostMapping("/getForm")
    public void getGoogleForm() {

    }
}
