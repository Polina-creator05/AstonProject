package writing;

import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class Writing<T> {

    public void writeToFile(T[] array, String path) {
        Arrays.stream(array)
                .map(s -> s.toString()
                        + "\n")
                .forEach(f -> {
                    try {
                        Files.write(Paths.get(path),
                                f.getBytes(),
                                StandardOpenOption.CREATE,
                                StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        System.err.printf("Произошла ошибка при записи в файл %s", path);
                        System.exit(1);

                    } catch (InvalidPathException e) {
                        System.err.printf("Ошибка: Файл по указанному пути %s не найден и не может быть создан", path);
                        System.exit(1);
                    }
                });
    }
}

