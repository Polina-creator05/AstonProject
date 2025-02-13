package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;
import search.Search;

import java.util.Scanner;

public class ChoiceSearch implements Action {
    ConsoleDataPrinter consoleDataPrinter = new ConsoleDataPrinter();
    Search search = new Search();

    @Override
    public void call() {
        if (ChoiceSort.inputSortString.equalsIgnoreCase("1")) {
            while (true) {
                consoleDataPrinter.printInstructions(Instruction.getMessageSearch(), TableForInstruction.getTableSearch());
                String userInput = new Scanner(System.in).nextLine();
                if (Verificator.verifayUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                    if (userInput.equalsIgnoreCase("1")) {
                        String searchResult = search.findElement(ChoiceClass.inputClassString);
                        consoleDataPrinter.printInfoMessage(searchResult);
                        break;
                    } else
                        break;
                }
            }
        }
    }
}
