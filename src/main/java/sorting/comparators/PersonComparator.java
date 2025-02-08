package sorting.comparators;

import model.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private final Comparator<Person> personComparator;

    public PersonComparator(){
        personComparator = new PersonSurnameComparator()
                .thenComparing(new PersonAgeComparator())
                .thenComparing(new PersonSexComparator());
    }

    @Override
    public int compare(Person p1, Person p2){
        return personComparator.compare(p1,p2);
    }
}