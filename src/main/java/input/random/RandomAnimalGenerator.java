package input.random;

import java.util.Random;

public class RandomAnimalGenerator implements RandomDataProvider {
    private final static Random random = new Random();
    private final static String[] ANIMALS = {
            "Bear", "Wolf", "Lion", "Tiger", "Hare", "Fox", "Deer", "Elephant", "Kangaroo",
            "Beaver", "Raccoon", "Badger", "Lynx", "Owl", "Mole"
    };

    private final static String[] EYES_COLOR = {"Yellow", "Blue", "Green", "Black", "Grey", "Orange"};

    @Override
    public String generate() {
        String type = ANIMALS[random.nextInt(ANIMALS.length)];
        String eyesColor = EYES_COLOR[random.nextInt(EYES_COLOR.length)];
        boolean hasWool = random.nextBoolean();

        return String.format("%s, %s, %b", type, eyesColor, hasWool);
    }
}