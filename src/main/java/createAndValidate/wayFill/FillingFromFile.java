package createAndValidate.wayFill;

import console.ConsoleDataPrinter;
import console.Instruction;


import java.io.IOException;
import java.util.Scanner;

public class FillingFromFile implements FillingWay {


    @Override
    public String[] collecteData(final Integer arrayLenght,  Class<?> clacc) {
        String[] lines = null;
        int i = 0;
        while (i <= 3) {
            ConsoleDataPrinter.printInfoMessage(Instruction.getMessageReadFromFile());
            String userInput = new Scanner(System.in).nextLine();
            try {
                lines = FileDataReaderEXP.readFile(userInput, arrayLenght);
            } catch (IOException e) {
                if (i < 3) {
                    ConsoleDataPrinter.printErrorMessage("Вы ввели некорректные данные");
                } else {
                    ConsoleDataPrinter.printErrorMessage("Ошибка: " + e.getMessage() + ". Программа завершена!");
                    System.exit(1);
                }
            } catch (IllegalArgumentException e) {
                if (i < 3) {
                    ConsoleDataPrinter.printErrorMessage("Ошибка при чтении файла: " + e.getMessage() + ".");
                } else {
                    ConsoleDataPrinter.printErrorMessage("Ошибка при чтении файла: " + e.getMessage() + ". Программа завершена!");
                    System.exit(1);
                }
            }

            if (lines != null) {
                break;
            } else {
                i++;
            }
        }
        return lines;
    }
}




