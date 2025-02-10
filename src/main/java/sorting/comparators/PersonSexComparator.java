package sorting.comparators;

import model.Person;

import java.util.Comparator;

public class PersonSexComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {

        return p1.getSex().name().compareToIgnoreCase(p2.getSex().name());
    }
}