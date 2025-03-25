package com.proy.files;

import java.io.File;
import java.util.List;

import com.proy.exceptions.CodeStandarException;
import com.proy.model.CodeSegment;
import com.proy.readers.ReaderFile;
import com.proy.validator.validatorContext.CodeValidationContext;
import com.proy.validator.validatorControlers.StructureCountValidator;

/**
 * La clase "FileCounter" proporciona los métodos que se necesitan para empezar
 * el conteo de lineas y validación de un archivo
 * 
 * @version 1.1
 */

public class FileCounter {

    private File file;
    private CodeSegment codeSegment;

    public FileCounter(File file) {
        this.file = file;
        this.codeSegment = new CodeSegment();
    }

    /**
     * Llama al CodeValidationContext para el conteo de líneas físicas y lógicas
     * siempre y cuando sea válido el formato
     * Instanciando el primer validador de FileStructureValidator que solo permite
     * estructuras de organización y de estructuras de definición
     */
    public void countLinesInFile() {
        if (!FileCounter.isJavaFile(file)) {
            System.out.println(this.file.getName() + " no es un archivo con extensión válida");
            return;
        }

        List<String> lines = new ReaderFile().readFileLines(file);
        int initialLines = lines.size();

        try {
            validateAndSetCodeSegment(lines);
        } catch (CodeStandarException e) {
            int errorLine = initialLines - lines.size() + 1;
            System.out.println(file.getName());
            System.err.println(e.getMessage() + " Línea: " + errorLine);
        } catch (Exception e) {
        }
    }

    /**
     * Genera el contexto para la validación de las líneas del archivo y lo valida 
     * 
     * @param lines las líneas del archivo
     * @throws CodeStandarException si el archivo no cumple con el estándar
     */
    private void validateAndSetCodeSegment(List<String> lines) throws CodeStandarException {
        CodeValidationContext codeValidationContext = new CodeValidationContext();
        codeValidationContext.setStandardValidator(new StructureCountValidator(codeValidationContext));
        codeValidationContext.validate(lines);

        this.codeSegment = codeValidationContext.getCodeSegment();
        this.codeSegment.setTitle(file.getName());
    }

    /**
     * Verifica si un archivo es un archivo Java (.java)
     * 
     * @param file el archivo a verificar
     * @return {@code true} si el archivo es un archivo Java, {@code false} en caso
     *         contrario.
     */
    public static boolean isJavaFile(File file) {
        return file.isFile() && file.getName().endsWith(".java");
    }

    /**
     * Devuelve el segmento de código del archivo
     * 
     * @return el segmento de código del archivo
     */
    public CodeSegment getCodeSegment() {
        return this.codeSegment;
    }
}
