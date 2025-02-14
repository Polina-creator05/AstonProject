package writing.list;

import console.ConsoleDataPrinter;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.List;
import java.util.Scanner;

public class WritingService {

    private static final int MAX_ATTEMPT = 3;

    public void writeToLogFile(List<String> lists) {

        int attepmts = 0;
        boolean success = false;

        while (attepmts < MAX_ATTEMPT && !success) {
            ConsoleDataPrinter.printInfoMessage("Введите полнoе имя файла, в который желаете записать данные");
            String filePath = new Scanner(System.in).nextLine();
            try {
                FileUtils.writeToFile(filePath, lists);
                success = true;
                ConsoleDataPrinter.printInfoMessage("Запись в файл проведена успешно");
            } catch (IOException e) {
                 attepmts++;
                 ConsoleDataPrinter.printErrorMessage(String.format("Произошла ошибка при записи в файл %s", filePath));
                if (attepmts == MAX_ATTEMPT) {
                    ConsoleDataPrinter.printErrorMessage("Превышено количество попыток записи. Логирование прекращено");
                }
            } catch (InvalidPathException e) {
                 attepmts++;
                 ConsoleDataPrinter.printErrorMessage(String.format("Ошибка: Файл по указанному пути %s не найден и не может быть создан", filePath));
                if (attepmts == MAX_ATTEMPT) {
                    ConsoleDataPrinter.printErrorMessage("Превышено количество попыток записи. Логирование прекращено");
                }
            }
        }
    }
}

