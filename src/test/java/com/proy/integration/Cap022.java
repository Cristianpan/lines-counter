package com.proy.integration;

public class Cap022 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap022File.java"
    };

    public static void main(String[] args) {
        Cap022 cap22 = new Cap022();
        cap22.test(PATH[0]);
    }
}