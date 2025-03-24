package com.proy.integration;

public class Cap014 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap014File.java"
    };

    public static void main(String[] args) {
        Cap014 cap14 = new Cap014();
        cap14.test(PATH[0]);
    }
}