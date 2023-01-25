package ex1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserWriter {
    public static void main(String[] args) {
        System.out.println("Enter the User");
        String user =new Scanner(System.in).nextLine();

        File file = new File("MySecondFile");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(user+"\nSalam alekum");
            bw.write("\nAsdasdfafada");
            bw.write("\nadasdfasdasdasdasdasdasdsafdafafasfasf");
            bw.write("\nHello worlds");
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
