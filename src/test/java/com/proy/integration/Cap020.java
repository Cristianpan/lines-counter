package com.proy.integration;

public class Cap020 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap020File.java"
    };

    public static void main(String[] args) {
        Cap020 cap20 = new Cap020();
        cap20.test(PATH[0]);
    }
}