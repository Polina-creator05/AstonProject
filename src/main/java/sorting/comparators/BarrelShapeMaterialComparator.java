package sorting.comparators;

import model.Barrel;

import java.util.Comparator;

public class BarrelShapeMaterialComparator  implements Comparator<Barrel> {

    @Override
    public int compare(Barrel b1, Barrel b2) {

        return b1.getShapeMaterial().compareToIgnoreCase(b2.getShapeMaterial());
    }
}