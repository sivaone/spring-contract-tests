package com.github.sivaone.contractconsumertests.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/loans")
public class LoanApplicationController {

    private final RestTemplate restTemplate;

    public LoanApplicationController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PutMapping(path = "/validate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FraudCheckResponse> validateLoanApplication(@RequestBody FraudCheckRequest fraudCheckRequest) {
        HttpHeaders httpHeaders =  new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<FraudCheckRequest> httpEntity = new HttpEntity<>(fraudCheckRequest, httpHeaders);

        ResponseEntity<FraudCheckResponse> response = restTemplate.exchange("http://localhost:8080/fraudcheck", HttpMethod.PUT, httpEntity, FraudCheckResponse.class);
        return ResponseEntity.ok(response.getBody());
    }
}
