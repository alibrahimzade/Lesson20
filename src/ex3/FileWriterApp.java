package ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class FileWriterApp {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("Test.txt");
            byte[] bytes = "Hello World".getBytes(StandardCharsets.UTF_8);
            System.out.println(Arrays.toString(bytes));
            fos.write(bytes);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------");



    }
}
