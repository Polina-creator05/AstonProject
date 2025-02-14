package writing.array;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileUtilsEXP {

    public static void writeToFile(String filepath, String string) throws InvalidPathException, IOException{
        Files.write(Paths.get(filepath), string.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
