package ex1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UserReader {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ASUS\\Desktop\\projects\\Lesson20FilesIO\\MySecondFile");

        try {
            FileReader fR = new FileReader(file);

            while (true){
                int temp = fR.read();
                if (temp==-1) break;
                System.out.print((char)temp);
            }

            fR.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
