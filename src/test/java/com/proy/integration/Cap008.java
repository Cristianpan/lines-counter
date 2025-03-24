package com.proy.integration;


public class Cap008 extends CapIntegrationTest {
    private static final String[] PATH = {
        "src\\test\\resources\\integration_test_resources\\Cap008File.java"
    };

    public static void main(String[] args) {
        Cap008 cap08 = new Cap008();
        cap08.test(PATH[0]);
    }
}
