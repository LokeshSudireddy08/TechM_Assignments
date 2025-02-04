package IO_Streams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
 public static void main(String[] args) {
     try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/YourUsername/Documents/sample.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
