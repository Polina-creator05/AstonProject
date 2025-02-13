package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;
import repository.ArrayOfObjects;
import sorting.Sorting;

import java.util.Scanner;

public class ChoiceSort implements Action {
    Sorting sorting = new Sorting();
    ArrayOfObjects arrayOfObjects = new ArrayOfObjects();

    public static String inputSortString = null;

    @Override
    public void call() {

        while (true) {
            ConsoleDataPrinter.printInstructions(Instruction.getMessageSort(), TableForInstruction.getTableSort());
            String userInput = new Scanner(System.in).nextLine();
            if (Verificator.verifyUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                inputSortString= userInput;
                try {
                    sorting.getSortedArray(ChoiceClass.inputClassString, userInput);
                    ConsoleDataPrinter.printCollection(arrayOfObjects.getArray());
                    break;
                } catch (ClassCastException e) {
                    ConsoleDataPrinter.printInfoMessage("Для данного типа объектов выбранный вариант сортировки невозможен. Выберите другой тип сортировки");
                }
            }
        }
    }
}

