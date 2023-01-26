package ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("ForExercise");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Salam");
            bw.write("\nNecesen?");
            bw.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                int c = br.read();
                if (c == -1) break;
                System.out.print((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
