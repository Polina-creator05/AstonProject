package model;

import java.util.Objects;

public class Animal implements Comparable<Animal>{

    private String species;
    private String eyeColor;
    private boolean wool;

    public Animal(final String species,
                  final String eyeColor,
                  final boolean wool) {
        this.species = species;
        this.eyeColor = eyeColor;
        this.wool = wool;
    }

    @Override
    public String toString() {
        return "component.Animal{" +
                "species='" + species + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", wool=" + wool +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Animal animal = (Animal) o;
        return wool == animal.wool && Objects.equals(species, animal.species) && Objects.equals(eyeColor, animal.eyeColor);
    }

    @Override
    public int compareTo(Animal other) {
        return this.species.compareTo(other.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, eyeColor, wool);
    }

    public String getSpecies() {
        return species;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isWool() {
        return wool;
    }


    public static class AnimalBuilder {
        private String species;
        private String eyeColor;
        private boolean wool;


        public AnimalBuilder species(String species) {
            this.species = species;
            return this;
        }

        public AnimalBuilder eyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public AnimalBuilder wool(boolean wool) {
            this.wool = wool;
            return this;
        }

        public Animal build() {
            return new Animal(species, eyeColor, wool);
        }

    }
}
