package com.github.sivaone.contractconsumertests.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckResponse {
    private String fraudCheckStatus;
    private String rejectionReason;

    @JsonProperty("executionTime")
    private Date executionTime() {
        return new Date();
    }
}
