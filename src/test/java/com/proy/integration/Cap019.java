package com.proy.integration;

public class Cap019 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap019File.java"
    };

    public static void main(String[] args) {
        Cap019 cap19 = new Cap019();
        cap19.test(PATH[0]);
    }
}