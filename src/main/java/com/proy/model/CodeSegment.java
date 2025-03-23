package com.proy.model;

/**
 * La clase "CodeSegment" representa un segmento de código que tienen líneas
 * lógicas y físicas y guarda la cantidad de líneas físicas y lógicas contadas
 * en ese segmento
 * 
 * @version 1.1
 */

public class CodeSegment {
    private int physicalLines;
    private int logicalLines;
    private int numMethods;
    private String title;
    private boolean isAClass; 

    public CodeSegment() {
        this.physicalLines = 0;
        this.logicalLines = 0;
        this.numMethods = 0;
        this.isAClass = false;
    }

    public CodeSegment(int physicalLines, int logicalLines, int numMethods, boolean isAClass) {
        this.physicalLines = physicalLines;
        this.logicalLines = logicalLines;
        this.numMethods = numMethods;
        this.isAClass = isAClass;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.replace(".java", "");
    }

    public int getLogicalLines() {
        return logicalLines;
    }

    public void setLogicalLines(int logicalLines) {
        this.logicalLines = logicalLines;
    }

    public int getPhysicalLines() {
        return physicalLines;
    }

    public void setPhysicalLines(int physicalLines) {
        this.physicalLines = physicalLines;
    }

    public void addPhysicalLines(int lines) {
        setPhysicalLines(getPhysicalLines() + lines);
    }

    public void addLogicalLines(int lines) {
        setLogicalLines(getLogicalLines() + lines);
    }

    public void incrementNumMethods() {
        this.numMethods++;
    }

    public int getNumMethods() {
        return this.numMethods;
    }

    public boolean isAClass() {
        return this.isAClass;
    }

    public void addLogicalAndPhysicalLines(int lines) {
        setPhysicalLines(getPhysicalLines() + lines);
        setLogicalLines(getLogicalLines() + lines);
    }

    public void addPhysicalLine() {
        setPhysicalLines(getPhysicalLines() + 1);
    }

    public void addLogicalLine() {
        setLogicalLines(getLogicalLines() + 1);
    }

    public void addLogicalAndPhysicalLine() {
        setPhysicalLines(getPhysicalLines() + 1);
        setLogicalLines(getLogicalLines() + 1);
    }
}
