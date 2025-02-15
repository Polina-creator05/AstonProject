package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;
import repository.ArrayOfObjects;
import writing.array.WritingEXP;

import java.util.Scanner;

public class ChoiceOutputEXP implements Action {

    WritingEXP writingEXP= new WritingEXP();
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
                writingEXP.writeToFile(arrayOfObjects.getArray());
                break;
            }
        }
    }
}
