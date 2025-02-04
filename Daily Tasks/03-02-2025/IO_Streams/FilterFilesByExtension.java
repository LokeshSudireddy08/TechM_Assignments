package IO_Streams;
import java.io.File;

public class FilterFilesByExtension {
 public static void main(String[] args) {
     File directory = new File("C:\\Users\\LOKESH\\eclipse-workspace\\lokesh");
     String extension = ".txt";

     File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));

     if (files != null) {
         for (File file : files) {
             System.out.println(file.getName());
         }
     }
 }
}
