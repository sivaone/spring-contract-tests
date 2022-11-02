package com.github.sivaone.contracttests.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudCheckingController {

    @PutMapping(
            value = "/fraudcheck",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<FraudCheckResponse> checkFraud(@RequestBody FraudCheckRequest req) {
        if(req.getLoanAmount() > 999) {
            return ResponseEntity.ok(new FraudCheckResponse("FRAUD", "Amount too high"));
        } else {
            return ResponseEntity.ok(new FraudCheckResponse("OK", "Amount OK"));
        }
    }
 }
