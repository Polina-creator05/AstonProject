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
import sorting.comparators.AnimalComparator;
import sorting.comparators.BarrelComparator;
import sorting.comparators.PersonComparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class Search<T>{

    ConsoleDataPrinter consoleDataPrinter = new ConsoleDataPrinter();
    BinarySearchEXP binarySearchEXP = new BinarySearchEXP();

    ArrayOfObjects arrayOfObjects = new ArrayOfObjects();

    Map<String, Class<?>> classMap = Map.of("1", Animal.class, "2", Barrel.class, "3", Person.class);

    Map<String, Comparator<?>> comparatorMap = Map.of("1", new AnimalComparator(),
            "2", new BarrelComparator(), "3", new PersonComparator());

    Map<String, EntityFactory<?>> entityFactoryMap = Map.of("1", new AnimalFactory(),
            "2", new BarrelFactory(),
            "3", new PersonFactory());

    public <T> String findElement(String inputClass) {
        Class clacc = classMap.get(inputClass);

        String[] args;
        while (true) {
            consoleDataPrinter.printInfoMessage(Instruction.getMessageObject(clacc));
            String inputObject = new Scanner(System.in).nextLine();
            args = inputObject.split(",");

            if (args.length != 3) {
                System.out.println("Неверное количество аргументов в строке: " + inputObject);
            }
            try {
                T target = (T) entityFactoryMap.get(inputClass).create(args);
                Comparator comparator = comparatorMap.get(inputClass);
                String result = binarySearchEXP.search(arrayOfObjects.getArray(), target, comparator);
                return result;
            } catch (IllegalArgumentException e) {
                System.out.println("Вы ввели объект не соответствующий первоначально выбранному типу");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Количество аргументов должно 3");
            }
        }
    }
}
