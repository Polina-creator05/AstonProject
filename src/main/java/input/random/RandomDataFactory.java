package input.random;

import model.Animal;
import model.Barrel;
import model.Person;

public class RandomDataFactory {
    private static final Class<?>[] TYPES = {Animal.class, Barrel.class, Person.class};
    private static final RandomDataProvider[] GENERATORS = {
            new RandomAnimalGenerator(),
            new RandomBarrelGenerator(),
            new RandomPersonGenerator()
    };

    public static RandomDataProvider getGenerator(Class<?> type) {
        for (int i = 0; i < TYPES.length; i++) {
            if (type == TYPES[i]) {
                return GENERATORS[i];
            }
        }
        throw new IllegalArgumentException("Неверный тип аргумента!");
    }
}