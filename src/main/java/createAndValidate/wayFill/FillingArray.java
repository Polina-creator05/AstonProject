package createAndValidate.wayFill;

import createAndValidate.Validate.Validator;
import createAndValidate.factory.AnimalFactory;
import createAndValidate.factory.BarrelFactory;
import createAndValidate.factory.EntityFactory;
import createAndValidate.factory.PersonFactory;
import model.Animal;
import model.Barrel;
import model.Person;
import repository.MapRepository;

import java.util.Map;

public class FillingArray {

    MapRepository mapRepository = new MapRepository();


    public <T> T[] fill(String inputClass, int arrayLength, String inputWayFill) {
        Class clacc = mapRepository.getClassMap().get(inputClass);


        String[] strings = mapRepository.getFillingWayMap().get(inputWayFill).collecteData(arrayLength, clacc);

        EntityFactory<T> entityFactory = mapRepository.getEntityFactoryMap().get(inputClass);

        T[] arrayObjects = (T[]) Validator.validate(strings, entityFactory, clacc);


        return arrayObjects;
    }
}
