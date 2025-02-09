import model.Animal;
import model.Barrel;
import model.Person;
import model.Sex;
import search.BinarySearch;
//import sort.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Animal[] animals = {
                new Animal.AnimalBuilder().species("Cat").eyeColor("Green").wool(true).build(),
                new Animal.AnimalBuilder().species("Dog").eyeColor("Brown").wool(true).build(),
                new Animal.AnimalBuilder().species("Elephant").eyeColor("Gray").wool(false).build()
        };

        // Выбираем метод сортировки (стратегия)
//        InsertionSort<Animal> sorter = new InsertionSort<>();
//        sorter.sort(animals);

        System.out.println("Sorted:");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // Ввод искомого элемента
        System.out.print("\nEnter animal type: ");
        String species = scanner.nextLine();

        // Создаем бинарный поиск
        BinarySearch<Animal> searcher = new BinarySearch<>();
        Animal target = new Animal.AnimalBuilder().species(species).build();
        int index = searcher.search(animals, target);

        if (index != -1) {
            System.out.println("Element founded: " + animals[index]);
        } else {
            System.out.println("Element did not found.");
        }
    }
}

