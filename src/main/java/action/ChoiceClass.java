package action;

import console.*;


import java.util.Scanner;

public class ChoiceClass implements Action {

    ConsoleDataPrinter consoleDataPrinter = new ConsoleDataPrinter();


    public static String inputClassString = null;


    @Override
    public void call() {
        while (true) {
            consoleDataPrinter.printInstructions(Instruction.getMessageClass(), TableForInstruction.getTableClass());
            String userInput = new Scanner(System.in).nextLine();
            if (Verificator.verifayUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                inputClassString=userInput;
                break;
            }
        }
    }
}
