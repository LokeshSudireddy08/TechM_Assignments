package IO_Streams;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class ReadPlainTextFile {
 public static void main(String[] args) throws IOException {
     List<String> lines = Files.readAllLines(Paths.get("C:\\21eg110b52"));
     lines.forEach(System.out::println);
 }
}
