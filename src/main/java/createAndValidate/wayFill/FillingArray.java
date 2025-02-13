package createAndValidate.wayFill;

import createAndValidate.Validate.Validator;
import createAndValidate.factory.AnimalFactory;
import createAndValidate.factory.BarrelFactory;
import createAndValidate.factory.EntityFactory;
import createAndValidate.factory.PersonFactory;
import model.Animal;
import model.Barrel;
import model.Person;

import java.util.Map;

public class FillingArray {


    Map<String, Class<?>> classMap = Map.of("1", Animal.class, "2", Barrel.class, "3", Person.class);

    Map<String, EntityFactory> entityFactoryMap = Map.of("1", new AnimalFactory(),
            "2", new BarrelFactory(),
            "3", new PersonFactory());

    Map<String, FillingWay> fillingWayMap = Map.of("1", new FillingFromFile(),
            "2", new FillingRandom(),
            "3", new FillingByYourself());


    public <T> T[] fill(String inputClass, int arrayLength, String inputWayFill) {
        Class clacc = classMap.get(inputClass);

        String[] strings = fillingWayMap.get(inputWayFill).collecteData(arrayLength, clacc);

        EntityFactory<T> entityFactory = entityFactoryMap.get(inputClass);

        T [] arrayObjects = (T[]) Validator.validate(strings, entityFactory, clacc);
        return arrayObjects;
    }
}
