package com.proy.integration;

public class Cap007 extends CapIntegrationTest {
    private static final String[] PATH = {
        "src\\test\\resources\\integration_test_resources\\Cap007File.java"
    };


    public static void main(String[] args) {
        Cap007 cap07 = new Cap007();
        cap07.test(PATH[0]);
    }
}
