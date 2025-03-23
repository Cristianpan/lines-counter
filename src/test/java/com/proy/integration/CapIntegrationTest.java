package com.proy.integration;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Scanner;

import com.proy.model.ProgramAnalyzer;
import com.proy.readers.HandleInput;


public class CapIntegrationTest {

    private Scanner prepareScanner(String simulatedInput) {
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(inputStream);

        return scanner; 
    }

    public void test(String simulatedInput) {
        try {
            Path path = HandleInput.getInput(this.prepareScanner(simulatedInput));
            new ProgramAnalyzer().analyzeProgram(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
