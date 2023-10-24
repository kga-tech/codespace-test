package com.clockwork.clockworkjava.Controllers;

import com.clockwork.clockworkjava.Class.Created;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.asm.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import java.util.Map;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class AppController {




    @Autowired
    private WebClient webClient;


    @GetMapping("get-clockwork")
    public Mono<Object[]> App() {

        Mono<Object[]> data = webClient.get()
                .uri("https://api.clockwork.report/v1/worklogs?expand=issues,authors,worklogs")
                .header("Authorization", "Token l8Q2ojgDsK6rKfGzJ/ISu7HL+7dIP0qJwNh0dEJxicBWSe8VEDJinyiDkBk+0unofDNRNCvMtvz/q1IknPRNJkIJzeO8Sqj25sjCJA==--Sf/WU+7x1JXyPtxM--/CbgquTBb2Jm5V9ZWKUpVw==")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Object[].class);

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> = mapper.readValue(data, new TypeReference<Map<String, Object>>() { });






//        System.out.println(response);

//        return "hello world";
//        return response;

    }
}
