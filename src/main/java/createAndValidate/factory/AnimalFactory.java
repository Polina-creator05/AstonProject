package createAndValidate.factory;

import createAndValidate.Validate.ValidationUtils;
import model.Animal;


public class AnimalFactory implements EntityFactory<Animal>{
    @Override
    public Animal create(String[] args) {
        String species = args[0].trim();
        String eyeColor = args[1].trim();
        String hasWool = args[2].trim();

        if (!ValidationUtils.isValidString(species) ||
                !ValidationUtils.isValidString(eyeColor) ||
                !ValidationUtils.isValidBoolean(hasWool)) {
            throw new IllegalArgumentException("Ошибка валидации данных Animal!");
        }

        boolean wool = Boolean.parseBoolean(hasWool);
        return new Animal.AnimalBuilder()
                .species(species)
                .eyeColor(eyeColor)
                .wool(wool)
                .build();
    }
}