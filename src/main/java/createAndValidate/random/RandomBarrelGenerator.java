package createAndValidate.random;

import java.util.Random;


public class RandomBarrelGenerator implements RandomDataProvider {
    private static final Random random = new Random();
    private final static String[] STORE_MATERIAL = {
            "Vine", "Beer", "Oil", "Acid", "Water", "Syrup", "Alcohol", "Milk", "Juice", "Chemicals"
    };
    private final static String[] SHAPE_MATERIAL = {"Aluminium", "Steel", "Wood", "Plastic", "Iron"};

    @Override
    public String generate() {
        int volume = random.nextInt(100) + 1;
        String storeMaterial = STORE_MATERIAL[random.nextInt(STORE_MATERIAL.length)];
        String shapeMaterial = SHAPE_MATERIAL[random.nextInt(SHAPE_MATERIAL.length)];

        return String.format("%d, %s, %s", volume, storeMaterial, shapeMaterial);
    }
}

