package model;

import java.util.Objects;

public class Barrel{

    private int volume;
    private String storeMaterial;
    private String shapeMaterial;

    public Barrel(final int volume, final String storeMaterial, final String shapeMaterial) {
        this.volume = volume;
        this.storeMaterial = storeMaterial;
        this.shapeMaterial = shapeMaterial;
    }

    @Override
    public String toString() {
        return "component.Barrel{" +
                "volume=" + volume +
                ", storeMaterial='" + storeMaterial + '\'' +
                ", shapeMaterial='" + shapeMaterial + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Barrel barrel = (Barrel) o;
        return volume == barrel.volume && Objects.equals(storeMaterial, barrel.storeMaterial) && Objects.equals(shapeMaterial, barrel.shapeMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, storeMaterial, shapeMaterial);
    }


    public int getVolume() {
        return volume;
    }

    public String getStoreMaterial() {
        return storeMaterial;
    }

    public String getShapeMaterial() {
        return shapeMaterial;
    }

    public static class BarrelBuilder {
        private int volume;
        private String storeMaterial;
        private String shapeMaterial;

        public BarrelBuilder volume(int volume) {
            this.volume = volume;
            return this;
        }

        public BarrelBuilder storeMaterial(String storeMaterial) {
            this.storeMaterial = storeMaterial;
            return this;
        }

        public BarrelBuilder shapeMaterial(String shapeMaterial) {
            this.shapeMaterial = shapeMaterial;
            return this;
        }

        public Barrel build(){
            return new Barrel(volume, storeMaterial,shapeMaterial);
        }

    }
}
