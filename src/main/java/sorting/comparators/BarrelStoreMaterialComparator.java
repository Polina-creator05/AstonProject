package sorting.comparators;

import model.Barrel;

import java.util.Comparator;

public class BarrelStoreMaterialComparator implements Comparator<Barrel> {

    @Override
    public int compare(Barrel b1, Barrel b2) {

        return b1.getStoreMaterial().compareToIgnoreCase(b2.getStoreMaterial());
    }
}