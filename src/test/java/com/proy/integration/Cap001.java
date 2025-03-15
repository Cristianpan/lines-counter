package com.proy.integration;

import java.io.FileNotFoundException;

import com.proy.readers.HandleInput;

public class Cap001 {
    private final String[] PATH = {
        "src\\test\\resources\\integration_test_resources\\Cap001File.java"
    };

    private final String[] PATHNOJAVA = {
        "src\\test\\resources\\integration_test_resources\\Cap001NoJavaFile.py"
    };

    public void test() {
        HandleInput reader = new HandleInput();
        try {
            // reader.getInput(this.PATH);
            reader.getInput(this.PATHNOJAVA);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Cap001 cap01 = new Cap001();
        cap01.test();
    }
}
