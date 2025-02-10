package search;

import java.util.Comparator;

public class BinarySearch<T>{

    public int search(T[] array, T target, Comparator<T> comparator) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = compareElements(array[mid], target, comparator);

            if (comparison == 0) {
                return mid; // Элемент найден
            } else if (comparison < 0) {
                left = mid + 1; // Ищем в правой половине
            } else {
                right = mid - 1; // Ищем в левой половине
            }
        }
        return -1; // Элемент не найден
    }

    private int compareElements(T element1, T element2, Comparator<T> comparator) {
        return comparator.compare(element1, element2);

    }
}

