package com.proy.integration;

public class Cap004 extends CapIntegrationTest {
     private static final String[] PATH = {
        "src\\test\\resources\\integration_test_resources\\Cap004File.java"
    };

    public static void main(String[] args) {
        Cap004 cap04 = new Cap004();
        cap04.test(PATH[0]);
    }
}
