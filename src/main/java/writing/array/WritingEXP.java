package writing.array;

import console.ConsoleDataPrinter;

import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Scanner;

public class WritingEXP<T> {
    private static final int MAX_ATTEMPT = 3;

    public void writeToFile(T[] array) {
        final String[] exceptionIO = new String[1];
        final String[] exceptionInvalidPath = new String[1];
        int attepmts = 0;
        boolean success = false;
        while (attepmts < MAX_ATTEMPT && !success) {
            ConsoleDataPrinter.printInfoMessage("Введите полнoе имя файла, в который желаете записать данные");
            String filePath = new Scanner(System.in).nextLine();
            Arrays.stream(array)
                    .map(s -> s.toString()
                            + "\n")
                    .forEach(f -> {
                        try {
                            FileUtilsEXP.writeToFile(filePath, f);
                        } catch (IOException e) {
                            exceptionIO[0] = String.format("Произошла ошибка при записи в файл %s", filePath);
                        } catch (InvalidPathException e) {
                            exceptionInvalidPath[0] = String.format("Ошибка: Файл по указанному пути %s не найден и не может быть создан", filePath);
                        }
                    });
            if (exceptionIO[0] != null) {
                ConsoleDataPrinter.printErrorMessage(exceptionIO[0]);
                if (attepmts == MAX_ATTEMPT-1) {
                    ConsoleDataPrinter.printErrorMessage("Превышено количество попыток записи. Логирование прекращено");
                }
            } else if (exceptionInvalidPath[0] != null) {
                ConsoleDataPrinter.printErrorMessage(exceptionInvalidPath[0]);
                if (attepmts == MAX_ATTEMPT-1) {
                    ConsoleDataPrinter.printErrorMessage("Превышено количество попыток записи. Логирование прекращено");
                }
            } else {
                ConsoleDataPrinter.printInfoMessage("Запись в файл проведена успешно");
                success = true;
            }
            attepmts++;

        }
    }
}



