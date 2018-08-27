package com;

public class texthandler {

    public static void main(String[] args) {
       fileHandler fh = new fileHandler();

        switch (args[0]) {
            case "1": 
                fh.readFile();
                fh.cleanFile();
                fh.sortFile();
                fh.printFile();
                break;
            default: 
                fh.readFile();
        }
    }
}
    
