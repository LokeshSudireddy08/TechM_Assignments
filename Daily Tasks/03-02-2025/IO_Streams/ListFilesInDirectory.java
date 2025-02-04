package IO_Streams;
import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\LOKESH\\eclipse-workspace\\lokesh"; 
        File directory = new File(directoryPath);
        String[] fileList = directory.list();

        if (fileList != null) {
            for (String fileName : fileList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Directory does not exist or is empty.");
        }
    }
}
