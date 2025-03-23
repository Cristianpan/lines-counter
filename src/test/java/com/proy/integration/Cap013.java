package com.proy.integration;

public class Cap013 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap013File.java"
    };

    public static void main(String[] args) {
        Cap013 cap13 = new Cap013();
        cap13.test(PATH[0]);
    }
}