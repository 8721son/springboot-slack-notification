package com.example.slacknotification.controller;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotificationController {


    // https://hooks.slack.com/services/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

    @PostMapping
    public void send(){
        var restTemplate = new RestTemplate();

        var request = new HashMap<String,Object>();
        request.put("username", "gangmii");
        request.put("text", "알림 테스트");

        var entity = new HttpEntity<Map<String,Object>>(request);

        String url = "https://hooks.slack.com/services/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";

        restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

    }
}
