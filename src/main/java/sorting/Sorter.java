package sorting;

import java.util.Comparator;

public class Sorter<T> {
    private SortStrategy<T> strategy;

    public void setStrategy(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void sort(T[] array, Comparator<T> comparator) {
        if (strategy == null) {
            throw new IllegalStateException("Стратегия сортировки не установлена");
        }
        strategy.sort(array, comparator);
    }
}