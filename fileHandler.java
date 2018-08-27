package com;

import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class fileHandler {

    String inputFile;
    String outFile;

    public void readFile() {
        // writes all files of the current directory
        // System.out.println("Paths");

        String fileName = "input.txt";
        try {
            // Files.list(Paths.get(".")).forEach(System.out::println);
            inputFile = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (Exception e) {
            System.out.println(e.toString());
            ;
        }
    }

    public void printFile() {
        System.out.println(outFile);
    }

    public void sortFile() {
        String lines[] = inputFile.split("\\n");
        ArrayList<String> sentence = new ArrayList<String>();

        for (String line : lines) {
            sentence.add(line);
        }

        ArrayList<String> sortedList = new ArrayList<String>();
        for (int i = sentence.size() - 1; i > 0; i--) {
            sortedList.add(sentence.get(i));
        }

        // outFile = inputFile;
        // for(sortedList item: arrayList) {
        // outFile.add(item);
        // }

        Iterator iterator = sortedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void cleanFile() {
        inputFile = inputFile.replace("HTML - ", "");
        inputFile = inputFile.replace("www.tutorialspoint.com", "");
    }
}