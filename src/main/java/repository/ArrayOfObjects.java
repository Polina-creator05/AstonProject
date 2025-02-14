package repository;

public class ArrayOfObjects<T> {

   private static Object[] array ;

     public static void setArray(final Object[] array) {
        ArrayOfObjects.array = array;
    }

    public T[] getArray() {
        return (T[]) array;
    }

}
