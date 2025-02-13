package action;

import console.*;


import java.util.Scanner;

public class ChoiceClass implements Action {


    public static String inputClassString = null;


    @Override
    public void call() {
        while (true) {
            ConsoleDataPrinter.printInstructions(Instruction.getMessageClass(), TableForInstruction.getTableClass());
            String userInput = new Scanner(System.in).nextLine();
            if (Verificator.verifyUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                inputClassString=userInput;
                break;
            }
        }
    }
}

