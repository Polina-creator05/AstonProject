package writing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Writing<T> {

    public void writeToFile(T[] array, Path path) {
        Arrays.stream(array)
                .map(s -> s.toString()
                        + "\n")
                .forEach(f -> {
                    try {
                        Files.write(path,
                                f.getBytes(), StandardOpenOption.CREATE,
                                StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}

