package sorting;

import repository.ArrayOfObjects;
import model.Barrel;
import model.Person;
import sorting.comparators.AnimalComparator;
import sorting.comparators.BarrelComparator;
import sorting.comparators.PersonComparator;

import java.util.Comparator;
import java.util.Map;

public class Sorting {

    ArrayOfObjects arrayOfObjects = new ArrayOfObjects();

    Map<String, Comparator> comparatorMap = Map.of("1", new AnimalComparator(),
            "2", new BarrelComparator(), "3", new PersonComparator());

    Map<String, SortStrategy> sortStrategyMap = Map.of("1", new InsertionSort(),
            "2", new OddEvenSort<Barrel>(barrel -> barrel.getVolume()),
            "3", new OddEvenSort<Person>(person -> person.getAge()));


    public void getSortedArray(String inputClass, String userInput) {
        Sorter sorter= new Sorter();
        sorter.setStrategy(sortStrategyMap.get(userInput));
        sorter.sort(arrayOfObjects.getArray(),comparatorMap.get(inputClass));

    }

}
