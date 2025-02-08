package input;

public class Validator {
    public static <T> T[] validate(String[] lines, EntityFactory<T> factory) {
        T[] entities = (T[]) new Object[lines.length];
        int count = 0;

        for (String line : lines) {
            String[] args = line.split(",");

            if (args.length != 3) {
                System.out.println("Неверное количество аргументов в строке: " + line);
                continue;
            }

            try {
                entities[count++] = factory.create(args);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " в строке: " + line);
            }
        }
        return trimArray(entities, count);
    }

    private static<T> T[] trimArray(T[] array, int size) {
        T[] trimmedArray = (T[]) new Object[size];

        for (int i = 0; i < size; i++) {
            trimmedArray[i] = array[i];
        }
        return trimmedArray;
    }
}
