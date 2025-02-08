package sorting.comparators;

import model.Barrel;

import java.util.Comparator;

public class BarrelComparator implements Comparator<Barrel> {

    private final Comparator<Barrel> barrelComparator;

    public BarrelComparator(){
        barrelComparator = new BarrelVolumeComparator()
                .thenComparing(new BarrelStoreMaterialComparator())
                .thenComparing(new BarrelShapeMaterialComparator());
    }

    @Override
    public int compare(Barrel a1, Barrel a2){
        return barrelComparator.compare(a1,a2);
    }
}