package createAndValidate.wayFill;

import createAndValidate.random.RandomDataGenerator;

public class FillingRandom implements FillingWay {





    @Override
    public String[] collecteData(final Integer count,  Class<?> clacc) {
        return RandomDataGenerator.generateRandomData(count,clacc);
    }
}
