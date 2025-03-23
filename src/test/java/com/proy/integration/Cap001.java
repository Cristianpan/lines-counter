package com.proy.integration;

public class Cap001 extends CapIntegrationTest {

    private static final String[] PATHNOJAVA = {
            "src\\test\\resources\\integration_test_resources\\Cap001NoJavaFile.py"
    };

    public static void main(String[] args) {
        Cap001 cap01 = new Cap001();
        cap01.test(PATHNOJAVA[0]);
    }
}
