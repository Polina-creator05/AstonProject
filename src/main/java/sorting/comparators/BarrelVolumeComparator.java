package sorting.comparators;

import model.Barrel;

import java.util.Comparator;

public class BarrelVolumeComparator implements Comparator<Barrel> {

    @Override
    public int compare(Barrel b1, Barrel b2) {

        return Integer.compare(b1.getVolume(), b2.getVolume());
    }
}