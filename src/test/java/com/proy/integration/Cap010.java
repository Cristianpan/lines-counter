package com.proy.integration;

public class Cap010 extends CapIntegrationTest {
    private static final String[] PATH = {
            "src\\test\\resources\\integration_test_resources\\Cap010File.java"
    };

    public static void main(String[] args) {
        Cap010 cap10 = new Cap010();
        cap10.test(PATH[0]);
    }
}
