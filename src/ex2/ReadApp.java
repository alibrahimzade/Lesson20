package ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadApp {
    public static void main(String[] args) {
        try {
            File file = new File("file-writer-2.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String firstLine= null;
            while((firstLine = br.readLine()) != null) {
                System.out.println(firstLine);
            }
            br.close();
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
