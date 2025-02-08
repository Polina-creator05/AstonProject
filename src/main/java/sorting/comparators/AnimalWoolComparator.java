package sorting.comparators;

import model.Animal;

import java.util.Comparator;

public class AnimalWoolComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return (a1.isWool() ? 1 : 0) - (a2.isWool() ? 1 : 0);
    }
}