package sorting.comparators;

import model.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    private final Comparator<Animal> animalComparator;

    public AnimalComparator(){
        animalComparator = new AnimalSpeciesComparator()
                .thenComparing(new AnimalEyeColorComparator())
                .thenComparing(new AnimalWoolComparator());
    }

    @Override
    public int compare(Animal a1, Animal a2){
        return animalComparator.compare(a1,a2);
    }
}