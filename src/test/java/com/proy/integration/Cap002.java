package com.proy.integration;

public class Cap002 extends CapIntegrationTest{
    private static final String[] PATH = {
        "src\\test\\resources\\integration_test_resources\\Cap002Directory"
    };

    public static void main(String[] args) {
        Cap002 cap02 = new Cap002();
        cap02.test(PATH[0]);
    }
}
