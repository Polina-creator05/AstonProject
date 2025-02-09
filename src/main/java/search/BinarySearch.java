package search;

public class BinarySearch<T extends Comparable<T>> {

    public int search(T[] array, T target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = compareElements(array[mid], target);

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

    private int compareElements(T element1, T element2) {
        if (element1 instanceof String && element2 instanceof String) {
            return ((String) element1).toLowerCase().compareTo(((String) element2).toLowerCase());
        }
        return element1.compareTo(element2);
    }
}

