package model;

import java.util.Objects;

public class Person{
    private Sex sex;
    private int age;
    private String surname;

    public Person(final Sex sex, final int age, final String surname) {
        this.sex = sex;
        this.age = age;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex=" + sex +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Person person = (Person) o;
        return age == person.age && sex == person.sex && Objects.equals(surname, person.surname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(sex, age, surname);
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public static class PersonBuilder{
        private Sex sex;
        private int age;
        private String surname;

        public PersonBuilder sex(Sex sex){
            this.sex=sex;
            return this;
        }

        public PersonBuilder age(int age){
            this.age=age;
            return this;
        }

        public PersonBuilder surname(String surname){
            this.surname=surname;
            return this;
        }

        public Person build(){
            return  new Person(sex, age, surname);
        }

    }
}
