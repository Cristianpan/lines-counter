package com.proy.integration;

public class Cap005 extends CapIntegrationTest {
    private static final String[] PATH = {
        "src\\test\\resources\\integration_test_resources\\Cap005File.java"
    };

    public static void main(String[] args) {
        Cap005 cap05 = new Cap005();
        cap05.test(PATH[0]);
    }
}
