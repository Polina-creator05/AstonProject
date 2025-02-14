package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;
import search.Search;

import java.util.Scanner;

public class ChoiceSearch implements Action {
    Search search = new Search();

    @Override
    public void call() {
        if (ChoiceSort.inputSortString.equalsIgnoreCase("1")) {
            while (true) {
                ConsoleDataPrinter.printInstructions(Instruction.getMessageSearch(), TableForInstruction.getTableSearch());
                String userInput = new Scanner(System.in).nextLine();
                if (Verificator.verifyUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                    if (userInput.equalsIgnoreCase("1")) {
                        String searchResult = search.findElement(ChoiceClass.inputClassString);
                        ConsoleDataPrinter.printInfoMessage(searchResult);
                        break;
                    } else
                        break;
                }
            }
        }
    }
}
