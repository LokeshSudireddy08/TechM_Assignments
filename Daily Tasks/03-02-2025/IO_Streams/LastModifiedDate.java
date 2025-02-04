package IO_Streams;

import java.io.File;
import java.util.Date;

public class LastModifiedDate {
 public static void main(String[] args) {
     File file = new File("C:/Users/YourUsername/Documents/sample.txt");
     System.out.println("Last Modified: " + new Date(file.lastModified()));
 }
}
