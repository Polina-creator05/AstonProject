package search;

import createAndValidate.factory.AnimalFactory;
import createAndValidate.factory.BarrelFactory;
import createAndValidate.factory.EntityFactory;
import createAndValidate.factory.PersonFactory;
import repository.ArrayOfObjects;
import console.ConsoleDataPrinter;
import console.Instruction;
import model.Animal;
import model.Barrel;
import model.Person;
import repository.MapRepository;
import sorting.comparators.AnimalComparator;
import sorting.comparators.BarrelComparator;
import sorting.comparators.PersonComparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class Search<T>{

    MapRepository mapRepository= new MapRepository();

    BinarySearchEXP binarySearchEXP = new BinarySearchEXP();

    ArrayOfObjects arrayOfObjects = new ArrayOfObjects();



    public <T> String findElement(String inputClass) {
        Class clacc = mapRepository.getClassMap().get(inputClass);

        String[] args;
        while (true) {
            ConsoleDataPrinter.printInfoMessage(Instruction.getMessageObject(clacc));
            String inputObject = new Scanner(System.in).nextLine();
            args = inputObject.split(",");

            if (args.length != 3) {
                ConsoleDataPrinter.printErrorMessage("Неверное количество аргументов в строке: " + inputObject);
            }
            try {
                T target = (T) mapRepository.getEntityFactoryMap().get(inputClass).create(args);
                Comparator comparator = mapRepository.getComparatorMap().get(inputClass);
                String result = binarySearchEXP.search(arrayOfObjects.getArray(), target, comparator);
                return result;
            } catch (IllegalArgumentException e) {
                ConsoleDataPrinter.printErrorMessage("Вы ввели объект не соответствующий первоначально выбранному типу");
            }catch (ArrayIndexOutOfBoundsException e){
                ConsoleDataPrinter.printErrorMessage("Количество аргументов должно 3");
            }
        }
    }
}