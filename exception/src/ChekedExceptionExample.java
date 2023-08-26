/*
checked exception are caught at compile / build time
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ChekedExceptionExample {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("E:\\JavaDevelopment\\core-java-part-1\\exception\\src\\JavaDoc.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for (int i=0; i<10; i++) {
                System.out.println("LineNumber : " + i + bufferedReader.readLine());
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException ioException) {
            System.out.println("IOException " + ioException.getMessage());
        }
    }
}
