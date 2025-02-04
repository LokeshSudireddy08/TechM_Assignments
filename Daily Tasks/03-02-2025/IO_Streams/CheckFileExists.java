package IO_Streams;

import java.io.File;

public class CheckFileExists {
 public static void main(String[] args) {
     File file = new File("C:\\Users\\LOKESH\\eclipse-workspace\\lokesh\\sample.txt");
     System.out.println(file.exists() ? "Exists" : "Does not exist");
 }
}
