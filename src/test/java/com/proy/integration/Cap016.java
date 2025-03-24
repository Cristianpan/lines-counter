package com.proy.integration;

public class Cap016 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap016File.java"
    };

    public static void main(String[] args) {
        Cap016 cap16 = new Cap016();
        cap16.test(PATH[0]);
    }
}