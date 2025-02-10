package sorting.comparators;

import model.Animal;

import java.util.Comparator;

public class AnimalSpeciesComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getSpecies().compareToIgnoreCase(a2.getSpecies());
    }
}