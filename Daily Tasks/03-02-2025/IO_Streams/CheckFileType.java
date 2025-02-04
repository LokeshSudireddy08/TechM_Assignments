package IO_Streams;

import java.io.File;

public class CheckFileType {
 public static void main(String[] args) {
     File file = new File("C:\\Users\\LOKESH\\eclipse-workspace\\lokesh\\sample.txt");
     System.out.println(file.isDirectory() ? "Directory" : "File");
 }
}
