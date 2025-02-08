package input;

import model.Person;
import model.Sex;

public class PersonFactory implements EntityFactory<Person> {
    @Override
    public Person create(String[] args) {
        String sexStr = args[0].trim();
        String ageStr = args[1].trim();
        String surname = args[2].trim();

        if (!ValidationUtils.isValidSex(sexStr) ||
                !ValidationUtils.isValidNumber(ageStr) ||
                !ValidationUtils.isValidString(surname)) {
            throw new IllegalArgumentException("Ошибка валидации данных Person!");
        }

        Sex sex = Sex.valueOf(sexStr.toUpperCase());
        int age = Integer.parseInt(ageStr);

        return new Person.PersonBuilder()
                .sex(sex)
                .age(age)
                .surname(surname)
                .build();
    }
}
