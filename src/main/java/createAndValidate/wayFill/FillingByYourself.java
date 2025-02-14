package createAndValidate.wayFill;

import console.ConsoleDataPrinter;
import console.Instruction;

import java.util.Scanner;

public class FillingByYourself implements FillingWay {

    ConsoleReader consoleReader = new ConsoleReader();

    @Override
    public String[] collecteData(final Integer arrayLenght,  Class<?> clacc) {
        String[] strings = null;
        ConsoleDataPrinter.printInfoMessage(Instruction.getMessageReadFromConsole(arrayLenght, clacc));
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (i < arrayLenght && scan.hasNextLine()) {
            String str = scan.nextLine();
            strings = consoleReader.read(str);
            i++;
        }
        return strings;
    }
}
