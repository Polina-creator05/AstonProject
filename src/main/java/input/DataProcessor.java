package input;

import java.io.IOException;
import java.lang.reflect.Array;

public class DataProcessor {

    public static <T> T[] processFile(String filePath, EntityFactory<T> factory, Class<T> clacc) {
        try {
            String[] lines = FileDataReader.readFile(filePath);
            T[] validatedEntities = Validator.validate(lines, factory, clacc);
            return validatedEntities;
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage() + ". Программа завершена!");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage() + ". Программа завершена!");
            System.exit(1);
        }
        return (T[]) Array.newInstance(clacc, 0);
    }
}