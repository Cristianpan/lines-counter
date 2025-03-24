package com.proy.integration;


public class Cap003 extends CapIntegrationTest {
    private static final String[] PATH = {
        "src\\test\\resources\\integration_test_resources\\Cap003File.java"
    };

    public static void main(String[] args) {
        Cap003 cap03 = new Cap003();
        cap03.test(PATH[0]);
    }
}
