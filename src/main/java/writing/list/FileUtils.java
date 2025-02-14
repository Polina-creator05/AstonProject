package writing.list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileUtils {

    public static void writeToFile(String filepath, List<String> lists) throws IOException {
        Files.write(Paths.get(filepath), lists, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
