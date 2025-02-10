package sorting;

import java.util.Comparator;

interface SortStrategy<T> {
    void sort(T[] array, Comparator<T> comparator);
}