package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;


import java.util.Scanner;


public class ChoiceContinue implements Action {

    public static String inputContinue;

    @Override
    public void call() {
        while (true) {
            ConsoleDataPrinter.printInstructions(Instruction.getMessageContinue(), TableForInstruction.getTableContinue());
            String userInput = new Scanner(System.in).nextLine();
            if (Verificator.verifyUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                inputContinue = userInput;
                break;
            }
        }
    }
}

