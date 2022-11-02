package com.github.sivaone.contracttests;

import com.github.sivaone.contracttests.controller.FraudCheckingController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class BaseContractTest {

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new FraudCheckingController());
    }

}
