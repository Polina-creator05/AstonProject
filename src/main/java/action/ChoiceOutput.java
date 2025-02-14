package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;
import repository.ArrayOfObjects;
import writing.list.Writing;

import java.util.Scanner;

public class ChoiceOutput implements Action {

    Writing writing = new Writing();
    ArrayOfObjects arrayOfObjects = new ArrayOfObjects();

    @Override
    public void call() {
        while (true) {
            ConsoleDataPrinter.printInstructions(Instruction.getMessageWriteToFile(), TableForInstruction.getTableWrite());
            String userInput = new Scanner(System.in).nextLine();
            if (Verificator.verifyUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                if (userInput.equalsIgnoreCase("2")) {
                    break;
                }
                writing.writeToFile(arrayOfObjects.getArray());
                break;
            }
        }
    }
}
