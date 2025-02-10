package sorting;

import java.util.Comparator;
import java.util.function.Function;

public class OddEvenSort<T> implements SortStrategy<T> {
    private final Function<T, Integer> numericExtractor;

    public OddEvenSort(Function<T, Integer> numericExtractor) {
        this.numericExtractor = numericExtractor;
    }

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        T[] arr = (T[])new Object[10];
        int arrSize = 1;
        int start = 0;

        for (int i = 0; i < array.length; i++) {

            if(arrSize  == arr.length){
                T[] arr2 = (T[])new Object[arrSize+5];
                for (int k = 0; k < array.length; k++){
                    arr2[k] = arr[k];
                }
                arr = arr2;
            }

            if (numericExtractor.apply(array[i]) % 2 == 0) {
                arr[arrSize - 1] = array[i];
                arrSize++;
            }
        }

        for (int i = 1; i < arrSize - 1; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < array.length; i++) {
            if (numericExtractor.apply(array[i]) % 2 != 0) continue;
            array[i] = arr[start];
            start++;
        }
    }
}