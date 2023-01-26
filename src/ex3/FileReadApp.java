package ex3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileReadApp{
    public static void main(String[] args) {
        try {
            System.out.println((char) 72);
            FileInputStream fis = new FileInputStream("Test.txt");
            byte[] bytes = fis.readAllBytes();
            System.out.println(Arrays.toString(bytes));

            System.out.println(new String(bytes));
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
