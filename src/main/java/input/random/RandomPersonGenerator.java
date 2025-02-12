package input.random;

import model.Sex;

import java.util.Random;

public class RandomPersonGenerator implements RandomDataProvider {
    private static final Random random = new Random();
    private static final String[] MALE_SURNAMES = {
            "Ivanov", "Petrov", "Sidorov", "Kuznetsov", "Smirnov", "Popov", "Alekseev",
            "Belov", "Vasiliev", "Grigoryev", "Denisov", "Yegorov", "Zhukov", "Zaitsev",
            "Kovalev", "Lebedev", "Morozov", "Nikolaev", "Orlov", "Pavlov", "Romanov",
            "Safonov", "Tikhonov", "Ulyanov", "Fedorov", "Khoroshev", "Tsvetkov", "Sharikov",
            "Shcherbakov", "Yakovlev"
    };

    private static final String[] FEMALE_SURNAMES = {
            "Ivanova", "Petrova", "Sidorova", "Kuznetsova", "Smirnova", "Popova", "Alekseeva",
            "Belova", "Vasilieva", "Grigoryeva", "Denisova", "Yegorova", "Zhukova", "Zaitseva",
            "Kovaleva", "Lebedeva", "Morozova", "Nikolaeva", "Orlova", "Pavlova", "Romanova",
            "Safonova", "Tikhonova", "Ulyanova", "Fedorova", "Khorosheva", "Tsvetkova",
            "Sharikova", "Shcherbakova", "Yakovleva"
    };

    @Override
    public String generate() {
        Sex sex = random.nextBoolean() ? Sex.MAN : Sex.WOMEN;
        int age = random.nextInt(99) + 1;

        String surname = (sex == Sex.MAN)
                ? MALE_SURNAMES[random.nextInt(MALE_SURNAMES.length)]
                : FEMALE_SURNAMES[random.nextInt(FEMALE_SURNAMES.length)];

        return String.format("%s, %d, %s", sex, age, surname);
    }
}