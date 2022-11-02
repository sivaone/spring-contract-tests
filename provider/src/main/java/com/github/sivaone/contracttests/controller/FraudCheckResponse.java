package com.github.sivaone.contracttests.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckResponse {
    private String fraudCheckStatus;
    private String rejectionReason;
}
