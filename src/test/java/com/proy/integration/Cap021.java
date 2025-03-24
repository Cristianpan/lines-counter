package com.proy.integration;

public class Cap021 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap021File.java"
    };

    public static void main(String[] args) {
        Cap021 cap21 = new Cap021();
        cap21.test(PATH[0]);
    }
}