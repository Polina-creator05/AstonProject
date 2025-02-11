package input.random;

public class RandomDataGenerator {
    public static String[] generateRandomData(int count, Class<?> type) {
        RandomDataProvider generator = null;
        try {
            generator = RandomDataFactory.getGenerator(type);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.exit(1);
        }

        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            result[i] = generator.generate();
        }
        return result;
    }
}