package createAndValidate.random;


import console.ConsoleDataPrinter;

public class RandomDataGenerator {
    public static String[] generateRandomData(int count, Class<?> type) {
        RandomDataProvider generator = null;
        try {
            generator = RandomDataFactory.getGenerator(type);
        } catch (IllegalArgumentException e) {
            ConsoleDataPrinter.printErrorMessage(e.getMessage());
            System.exit(1);
        }

        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            result[i] = generator.generate();
        }
        return result;
    }
}


