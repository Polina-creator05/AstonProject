package action;

import console.ConsoleDataPrinter;
import console.Instruction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChoiceLength implements Action {

    public static int arrayLenght;

    @Override
    public void call() {
        while (true) {
            ConsoleDataPrinter.printInfoMessage(Instruction.getMessageLenght());
            try {
                arrayLenght = new Scanner(System.in).nextInt();
                if (arrayLenght <= 1) {
                    ConsoleDataPrinter.printErrorMessage("Количество объектов недостаточно для последующей сортировки");
                }else{
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели некорректные данные");
            }
        }
    }
}
