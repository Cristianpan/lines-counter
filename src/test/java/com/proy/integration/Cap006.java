package com.proy.integration;

public class Cap006 extends CapIntegrationTest{
    private static final String[] PATH = {
        "src\\test\\resources\\integration_test_resources\\Cap006File.java"
    };

    public static void main(String[] args) {
        Cap006 cap06 = new Cap006();
        cap06.test(PATH[0]);
    }
}
