package com.proy.integration;

public class Cap011 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap011File.java"
    };

    public static void main(String[] args) {
        Cap009 cap09 = new Cap009();
        cap09.test(PATH[0]);
    }
}