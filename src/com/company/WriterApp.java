package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterApp {
    public static void main(String[] args) {
        System.out.println("Enter the User");
        String user = new Scanner(System.in).nextLine();

        File file = new File("MyFile.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(user);
            bw.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
