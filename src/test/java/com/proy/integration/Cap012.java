package com.proy.integration;

public class Cap012 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap012File.java"
    };

    public static void main(String[] args) {
        Cap012 cap12 = new Cap012();
        cap12.test(PATH[0]);
    }
}
