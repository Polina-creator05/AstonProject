package console;

import java.util.Arrays;

public final class Table {

    private Table() {
    }

    public static void print(String[][] mapping) {
        for (String[] a : mapping) {
            Arrays.stream(a)
                    .forEach(s -> System.out.print("| " + s + " "));
            System.out.println("|");
        }
    }
}
