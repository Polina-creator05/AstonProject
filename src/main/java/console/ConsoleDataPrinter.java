package console;

import java.util.Arrays;

public class ConsoleDataPrinter<T> {


    public void printInstructions(String message, String[][]mapping) {
        printInfoMessage(message);
        Table.print(mapping);
    }


    public void printInfoMessage(final String message) {
        System.out.println(message);

    }

    public void printErrorMessage(final String message) {
        System.err.println(message);
    }

    public void printCollection(T[] array) {
        Arrays.stream(array)
                .forEach(System.out::println);
    }

 /* Arrays.stream(sortedObjects)
                .map(it ->
                        it.getSpecies() + " " +
                                it.getEyeColor() + " " +
                                it.isWool())
                .forEach(System.out::println);*/
}
