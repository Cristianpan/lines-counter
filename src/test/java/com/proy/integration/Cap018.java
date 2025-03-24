package com.proy.integration;

public class Cap018 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap018File.java"
    };

    public static void main(String[] args) {
        Cap018 cap18 = new Cap018();
        cap18.test(PATH[0]);
    }
}