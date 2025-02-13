package action;

import console.ConsoleDataPrinter;
import console.Instruction;
import console.TableForInstruction;
import console.Verificator;
import createAndValidate.wayFill.FillingArray;
import repository.ArrayOfObjects;

import java.util.Scanner;

public class ChoiceWayFill<T> implements Action {
    FillingArray fillingArray = new FillingArray();
    ArrayOfObjects arrayOfObjects = new ArrayOfObjects();


    @Override
    public void call() {
        while (true) {
            ConsoleDataPrinter.printInstructions(Instruction.getMessageFill(), TableForInstruction.getTableFill());
            String userInput = new Scanner(System.in).nextLine();
            if (Verificator.verifyUserInput(userInput, TableForInstruction.getTableClass()[0].length)) {
                T[] array = fillingArray.fill(ChoiceClass.inputClassString, ChoiceLength.arrayLenght, userInput);
                if(array.length>=2){
                    arrayOfObjects.setArray(array);
                    ConsoleDataPrinter.printInfoMessage("Исходный массив данных:");
                    ConsoleDataPrinter.printCollection(arrayOfObjects.getArray());
                    break;
                }else if(array.length==1){
                    ConsoleDataPrinter.printErrorMessage("Количество объектов недостаточно для последующей сортировки");
                }else {
                    ConsoleDataPrinter.printErrorMessage("Данные файла не соответствуют выбранному типу объектов");
                }
            }
        }
    }
}



