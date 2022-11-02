package com.github.sivaone.contracttests.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FraudCheckRequest {

    private String clientId;
    private long loanAmount;
}
