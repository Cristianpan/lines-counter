package com.proy.integration;

public class Cap023 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap023File.java"
    };

    public static void main(String[] args) {
        Cap023 cap23 = new Cap023();
        cap23.test(PATH[0]);
    }
}