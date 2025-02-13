package writing;

import console.ConsoleDataPrinter;

import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class Writing<T> {

    public void writeToFile(T[] array, String path) {
        final String[] exceptionIO=new String[1];
        final String[] exceptionInvalidPath= new String[1];
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
                        exceptionIO[0]= String.format("Произошла ошибка при записи в файл %s", path);
                    } catch (InvalidPathException e) {
                        exceptionInvalidPath[0]= String.format("Ошибка: Файл по указанному пути %s не найден и не может быть создан", path);
                    }
                });
        if(exceptionIO[0]!= null){
            ConsoleDataPrinter.printErrorMessage(exceptionIO[0]);
        }else if (exceptionInvalidPath[0]!= null){
            ConsoleDataPrinter.printErrorMessage(exceptionInvalidPath[0]);
        }else ConsoleDataPrinter.printInfoMessage("Запись в файл проведена успешно");
    }
}


