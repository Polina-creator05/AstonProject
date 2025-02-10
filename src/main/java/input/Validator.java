package input;

import java.lang.reflect.Array;

public class Validator {
    public static <T> T[] validate(String[] lines, EntityFactory<T> factory, Class<T> clacc) {
        T[] entities = (T[]) Array.newInstance(clacc, lines.length);
        int count = 0;

        for (String line : lines) {
            String[] args = line.split(",");

            if (args.length != 3) {
                System.out.println("Неверное количество аргументов в строке: " + line);
                continue;
            }

            try {
                T entity = factory.create(args);
                entities[count++] = entity;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " в строке: " + line);
            }
        }
        return trimArray(entities, clacc, count);
    }

    private static<T> T[] trimArray(T[] array, Class<T> clacc, int size) {
        T[] trimmedArray = (T[]) Array.newInstance(clacc, size);

        for (int i = 0; i < size; i++) {
            trimmedArray[i] = array[i];
        }
        return trimmedArray;
    }
}
