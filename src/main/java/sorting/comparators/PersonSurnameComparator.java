package sorting.comparators;

import model.Person;

import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getSurname().compareToIgnoreCase(p2.getSurname());
    }
}