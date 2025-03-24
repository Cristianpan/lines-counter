package com.proy.integration;

public class Cap015 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap015File.java"
    };

    public static void main(String[] args) {
        Cap015 cap15 = new Cap015();
        cap15.test(PATH[0]);
    }
}