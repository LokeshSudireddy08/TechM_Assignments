package IO_Streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFileToByteArray {
 public static void main(String[] args) throws IOException {
     File file = new File("C:/Users/YourUsername/Documents/sample.txt");
     byte[] content = Files.readAllBytes(file.toPath());
     System.out.println(new String(content));
 }
}
