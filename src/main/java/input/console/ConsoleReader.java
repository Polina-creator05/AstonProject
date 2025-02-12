package input.console;

public class ConsoleReader {
    private static String[] data = new String[10];
    private static int count = 0;

    public static String[] read(String str) {
        if (count == data.length) {
            increaseArray();
        }

        data[count++] = String.format("%s", str);
        return trimArray();
    }

    private static void increaseArray() {
        String[] increasedArray = new String[data.length * 2];
        System.arraycopy(data, 0, increasedArray, 0, data.length);
        data = increasedArray;
    }

    private static String[] trimArray() {
        String[] trimmedArray = new String[count];
        System.arraycopy(data, 0, trimmedArray, 0, count);
        return trimmedArray;
    }
}
