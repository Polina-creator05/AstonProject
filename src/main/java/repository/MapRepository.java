package repository;

import createAndValidate.factory.AnimalFactory;
import createAndValidate.factory.BarrelFactory;
import createAndValidate.factory.EntityFactory;
import createAndValidate.factory.PersonFactory;
import createAndValidate.wayFill.FillingByYourself;
import createAndValidate.wayFill.FillingFromFile;
import createAndValidate.wayFill.FillingRandom;
import createAndValidate.wayFill.FillingWay;
import model.Animal;
import model.Barrel;
import model.Person;
import sorting.InsertionSort;
import sorting.OddEvenSort;
import sorting.SortStrategy;
import sorting.comparators.AnimalComparator;
import sorting.comparators.BarrelComparator;
import sorting.comparators.PersonComparator;

import java.util.Comparator;
import java.util.Map;


public class MapRepository {

    private final Map<String, Class<?>> classMap = Map.of("1", Animal.class, "2", Barrel.class, "3", Person.class);

    private final Map<String, EntityFactory> entityFactoryMap = Map.of("1", new AnimalFactory(),
            "2", new BarrelFactory(),
            "3", new PersonFactory());

    private final Map<String, FillingWay> fillingWayMap = Map.of("1", new FillingFromFile(),
            "2", new FillingRandom(),
            "3", new FillingByYourself());

    private final Map<String, Comparator> comparatorMap = Map.of("1", new AnimalComparator(),
            "2", new BarrelComparator(), "3", new PersonComparator());

    private final Map<String, SortStrategy> sortStrategyMap = Map.of("1", new InsertionSort(),
            "2", new OddEvenSort<Barrel>(barrel -> barrel.getVolume()),
            "3", new OddEvenSort<Person>(person -> person.getAge()));


    public Map<String, Class<?>> getClassMap() {
        return Map.copyOf(classMap);
    }

    public Map<String, EntityFactory> getEntityFactoryMap() {
        return Map.copyOf(entityFactoryMap);
    }

    public Map<String, FillingWay> getFillingWayMap() {
        return Map.copyOf(fillingWayMap);
    }

    public Map<String, Comparator> getComparatorMap() {
        return Map.copyOf(comparatorMap);
    }


    public Map<String, SortStrategy> getSortStrategyMap() {
        return Map.copyOf(sortStrategyMap);
    }
}


