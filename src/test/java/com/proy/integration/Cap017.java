package com.proy.integration;

public class Cap017 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap017File.java"
    };

    public static void main(String[] args) {
        Cap017 cap17 = new Cap017();
        cap17.test(PATH[0]);
    }
}