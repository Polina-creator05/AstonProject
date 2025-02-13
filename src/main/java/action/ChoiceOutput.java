package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;
import repository.ArrayOfObjects;
import writing.Writing;

import java.util.Scanner;

public class ChoiceOutput implements Action{

    ConsoleDataPrinter consoleDataPrinter = new ConsoleDataPrinter();
    Writing writing= new Writing();
    ArrayOfObjects arrayOfObjects= new ArrayOfObjects();

    @Override
    public void call() {
        while (true) {
            consoleDataPrinter.printInstructions(Instruction.getMessageWriteToFile(), TableForInstruction.getTableWrite());
            String userInput = new Scanner(System.in).nextLine();
            if (Verificator.verifayUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                if(userInput.equalsIgnoreCase("2")){
                    break;
                }
                consoleDataPrinter.printInfoMessage("Введите полные имя файла, в который желаете записать данные");
                String file = new Scanner(System.in).nextLine();
                writing.writeToFile(arrayOfObjects.getArray(),file);
                break;
            }
        }
    }
}
