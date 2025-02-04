package IO_Streams;

import java.io.File;

public class CheckPermissions {
 public static void main(String[] args) {
     File file = new File("C:\\Users\\LOKESH\\eclipse-workspace\\lokesh\\sample.txt");
     System.out.println("Readable: " + file.canRead());
     System.out.println("Writable: " + file.canWrite());
 }
}
