package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("MyFile.txt");
        try {
            FileReader fr = new FileReader(file);
            while(true){
                int sym = fr.read();
                if (sym == -1) break;
                System.out.print((char) sym);
            }
            System.out.println();
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
