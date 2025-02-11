package consolUI;

import java.util.Map;
import java.util.Scanner;

public class ArrayFiller {
    public static Map<Integer, FillerStrategy> fillerMap = initFillerMap();

    public static int[] userInput(){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];
        int chosenClass = 0;
        int arraySize = 0;
        int fillerStrategy = 0;

        do {
            classPrompt();
            try {
                while(!scanner.hasNextInt()){
                    System.out.println("Неверный ввод");
                    scanner.next();
                    classPrompt();
                }
                chosenClass = scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while(chosenClass < 1 || chosenClass > 3);


        do{
            lengthPrompt();
            while(!scanner.hasNextInt()){
                System.out.println("Неверный ввод");
                scanner.next();
                lengthPrompt();
            }
            arraySize = scanner.nextInt();
        }while(arraySize == 0);


        do{
            filletPrompt();
            while(!scanner.hasNextInt()){
                System.out.println("Неверный ввод");
                scanner.next();
                filletPrompt();
            }
            fillerStrategy = scanner.nextInt();
        }while(fillerStrategy < 1 || fillerStrategy > 3);


        arr[0] = chosenClass;
        arr[1] = arraySize;
        arr[2] = fillerStrategy;

        return arr;
    }

    public static void classPrompt(){
        System.out.println("Выберите создаваемый класс:");
        System.out.println("1. Animal");
        System.out.println("2. Barrel");
        System.out.println("3. Human");
    }

    public static void lengthPrompt(){
        System.out.print("Введите длинну массива: ");
    }

    public static void filletPrompt(){
        System.out.println("Выберите способ заполнения");
        System.out.println("1. Ручная");
        System.out.println("2. Случайная генерация");
        System.out.println("3. Файловое заполнение");
    }

    // Подставить нужные классы
    public static Object[] createAndFillArray(int chosenClass, int arraySize, int chosenStrategy, Map<Integer, FillerStrategy> fillerMap){

        Object[] arr = new Object[arraySize];
        switch (chosenClass){
            case 1 -> arr = new Object[arraySize];//Animal
            case 2 -> arr = new Object[arraySize];//Barrel
            case 3 -> arr = new Object[arraySize];//Human
        }
        for(int i = 0; i < arraySize; i++){
            arr[i] = fillerMap.get(chosenStrategy).fill();
        }
        return arr;
    }

    //Подправить филлеры
    private static Map<Integer, FillerStrategy> initFillerMap(){
        return Map.of(1, new ManualFiller(), 2, new RandomFiller(), 3, new FileFiller());
    }
}
