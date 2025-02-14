package console;

import java.util.Arrays;

public final class ConsoleDataPrinter<T> {

    public ConsoleDataPrinter() {
    }

    public static void printInstructions(String message, String[][]mapping) {
        printInfoMessage(message);
        Table.print(mapping);
    }


    public static void printInfoMessage(final String message) {
        System.out.println(message);

    }

    public static void printErrorMessage(final String message) {
        System.err.println(message);
    }

    public static <T> void printCollection(T[] array) {
        Arrays.stream(array)
                .forEach(System.out::println);
    }
}
