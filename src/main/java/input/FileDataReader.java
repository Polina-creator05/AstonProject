package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader {

    public static String[] readFile(String filePath) throws IOException, IllegalArgumentException {
        String[] lines = new String[20];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty())
                    continue;

                if (count == lines.length) {
                    lines = expandArray(lines);
                }
                lines[count++] = line;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("Файл пуст!");
        }

        return trimArray(lines, count);
    }

    private static String[] expandArray(String[] array) {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    private static String[] trimArray(String[] array, int size) {
        String[] trimmedArray = new String[size];
        System.arraycopy(array, 0, trimmedArray, 0, size);
        return trimmedArray;
    }
}