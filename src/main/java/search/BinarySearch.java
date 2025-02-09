package search;

public class BinarySearch<T extends Comparable<T>> {

    public int search(T[] array, T target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = array[mid].compareTo(target);

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
}

