package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;
import createAndValidate.wayFill.FillingArray;
import repository.ArrayOfObjects;

import java.util.Scanner;

public class ChoiceWayFill implements Action {
    ConsoleDataPrinter consoleDataPrinter = new ConsoleDataPrinter<Void>();
    FillingArray fillingArray = new FillingArray();
    ArrayOfObjects arrayOfObjects = new ArrayOfObjects();


    @Override
    public void call() {
        while (true) {
            consoleDataPrinter.printInstructions(Instruction.getMessageFill(), TableForInstruction.getTableFill());
            String userInput = new Scanner(System.in).nextLine();
            if (Verificator.verifayUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                arrayOfObjects.setArray(fillingArray.fill(ChoiceClass.inputClassString, ChoiceLength.arrayLenght, userInput));
                consoleDataPrinter.printCollection(arrayOfObjects.getArray());
                break;
            }
        }
    }
}

