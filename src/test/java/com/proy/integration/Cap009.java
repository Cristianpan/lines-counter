package com.proy.integration;

public class Cap009 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap009File.java"
    };

    public static void main(String[] args) {
        Cap009 cap09 = new Cap009();
        cap09.test(PATH[0]);
    }
}
