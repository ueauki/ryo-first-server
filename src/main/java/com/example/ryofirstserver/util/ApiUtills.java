package com.example.ryofirstserver.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiUtills {

    @Autowired
    private RestTemplate restTemplate;

    private HttpHeaders createHeaders(String apiKey) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + apiKey);
        return headers;
    }

    private <T> HttpEntity<T> createHttpEntity(T body, String apiKey) {
        HttpHeaders headers = createHeaders(apiKey);
        return new HttpEntity<>(body, headers);
    }

    public <T> ResponseEntity<T> get(String url, String apiKey, Class<T> responseType) {
        HttpEntity<Void> entity = createHttpEntity(null, apiKey);
        return restTemplate.exchange(url, HttpMethod.GET, entity, responseType);
    }

    public <T> ResponseEntity<T> post(String url, String apiKey, Object requestBody, Class<T> responseType) {
        HttpEntity<Object> entity = createHttpEntity(requestBody, apiKey);
        return restTemplate.exchange(url, HttpMethod.POST, entity, responseType);
    }

}
