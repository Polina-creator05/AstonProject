package sorting;

import repository.ArrayOfObjects;
import model.Barrel;
import model.Person;
import repository.MapRepository;
import sorting.comparators.AnimalComparator;
import sorting.comparators.BarrelComparator;
import sorting.comparators.PersonComparator;

import java.util.Comparator;
import java.util.Map;

public class Sorting {

    MapRepository mapRepository = new MapRepository();
    ArrayOfObjects arrayOfObjects = new ArrayOfObjects();


    public void getSortedArray(String inputClass, String userInput) {
        Sorter sorter = new Sorter();
        if (userInput.equals("1")) {
            sorter.setStrategy(mapRepository.getSortStrategyMap().get(userInput));
        } else {
            sorter.setStrategy(mapRepository.getSortStrategyMap().get(inputClass));
        }
        sorter.sort(arrayOfObjects.getArray(), mapRepository.getComparatorMap().get(inputClass));

    }
}
