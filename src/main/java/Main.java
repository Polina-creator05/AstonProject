import model.Animal;
import search.BinarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal[] animals = {
                new Animal.AnimalBuilder().species("Cat").eyeColor("Green").wool(true).build(),
                new Animal.AnimalBuilder().species("Dog").eyeColor("Brown").wool(true).build(),
                new Animal.AnimalBuilder().species("Elephant").eyeColor("Gray").wool(false).build()
        };

        // Компаратор для сортировки животных по названию вида (species)
        Comparator<Animal> animalComparator = Comparator.comparing(Animal::getSpecies, String.CASE_INSENSITIVE_ORDER);

        // Сортируем массив перед бинарным поиском
        Arrays.sort(animals, animalComparator);

        System.out.println("Sorted Animals:");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // Ввод искомого элемента
        System.out.print("\nEnter animal type: ");
        String species = scanner.nextLine();

        // Создаем бинарный поиск
        BinarySearch<Animal> searcher = new BinarySearch<>();
        Animal target = new Animal.AnimalBuilder().species(species).build();
        int index = searcher.search(animals, target, animalComparator);

        if (index != -1) {
            System.out.println("Element found: " + animals[index]);
        } else {
            System.out.println("Element not found.");
        }
    }
}
