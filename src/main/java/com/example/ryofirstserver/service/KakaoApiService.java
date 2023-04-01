package com.example.ryofirstserver.service;

import com.example.ryofirstserver.util.ApiUtills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class KakaoApiService {

    @Autowired
    private ApiUtills apiUtills;
    @Value("${scheduler.properties.kakao-work-api-key}")
    private String apiKey;
    @Value("${scheduler.api-url}")
    private String kakaoUrl;

    public String getUserByEmail(String email) {
        String getUsersUrl = kakaoUrl + "/users.find_by_email?email=" + email;

        ResponseEntity<String> response = apiUtills.get(
                getUsersUrl,
                apiKey,
                String.class);

        String responseBody = response.getBody();
        return responseBody;
    }

}
