package createAndValidate.factory;

import createAndValidate.Validate.ValidationUtils;
import model.Barrel;


public class BarrelFactory implements EntityFactory<Barrel> {
    @Override
    public Barrel create(String[] args) {
        String volumeStr = args[0].trim();
        String storeMaterial = args[1].trim();
        String shapeMaterial = args[2].trim();

        if (!ValidationUtils.isValidNumber(volumeStr) ||
                !ValidationUtils.isValidString(storeMaterial) ||
                !ValidationUtils.isValidString(shapeMaterial)) {
            throw new IllegalArgumentException("Ошибка валидации данных Barrel!");
        }

        int volume = Integer.parseInt(volumeStr);

        return new Barrel.BarrelBuilder()
                .volume(volume)
                .storeMaterial(storeMaterial)
                .shapeMaterial(shapeMaterial)
                .build();
    }
}