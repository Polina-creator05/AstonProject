package sorting.comparators;

import model.Animal;

import java.util.Comparator;

public class AnimalEyeColorComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getEyeColor().compareToIgnoreCase(a2.getEyeColor());
    }
}