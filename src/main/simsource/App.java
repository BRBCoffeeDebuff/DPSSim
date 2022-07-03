package main.simsource;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CSVParser myCSVParser = new CSVParser();
        myCSVParser.localParse("src/main/simsource/ratings.csv");
    }



    /**
     * @param file
     */

}