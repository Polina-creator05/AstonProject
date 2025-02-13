package action;

import console.ConsoleDataPrinter;
import console.Instruction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChoiceLength implements Action{

    ConsoleDataPrinter consoleDataPrinter = new ConsoleDataPrinter();
   public static int arrayLenght;

    @Override
    public void call() {
        while (true) {
           consoleDataPrinter.printInfoMessage(Instruction.getMessageLenght());
         try{
             arrayLenght = new Scanner(System.in).nextInt();
             break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели некорректные данные");
            }
        }
    }
}
