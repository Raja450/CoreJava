package com;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        try {
            FileWriter fwrite = new FileWriter("E:myTestFile.txt");
            // writing the content into the FileOperationExample.txt file  
            fwrite.write("I am Raja Sah I am from Kolkata.");
            fwrite.write("\n I have done BCA from Brainware University");
            fwrite.write("\n I like to Play Cricket");


            // Closing the stream  
            fwrite.close();
            System.out.println("Content is successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
}