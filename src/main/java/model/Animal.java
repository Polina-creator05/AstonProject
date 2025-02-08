package model;

import java.util.Objects;

public class Animal {

    private String speciec;
    private String eyeColor;
    private boolean wool;

    public Animal(final String speciec,
                  final String eyeColor,
                  final boolean wool) {
        this.speciec = speciec;
        this.eyeColor = eyeColor;
        this.wool = wool;
    }

    @Override
    public String toString() {
        return "component.Animal{" +
                "speciec='" + speciec + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", wool=" + wool +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Animal animal = (Animal) o;
        return wool == animal.wool && Objects.equals(speciec, animal.speciec) && Objects.equals(eyeColor, animal.eyeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speciec, eyeColor, wool);
    }

    public String getSpeciec() {
        return speciec;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isWool() {
        return wool;
    }


    public static class AnimalBuilder {
        private String speciec;
        private String eyeColor;
        private boolean wool;


        public AnimalBuilder speciec(String speciec) {
            this.speciec = speciec;
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
            return new Animal(speciec, eyeColor, wool);
        }

    }
}
