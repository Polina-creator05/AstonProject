package console;

import java.util.Arrays;

public interface DataPrinter<T> {

    public void printInstructions(String message, String[][]mapping);



    public void printInfoMessage(final String message);

    public void printErrorMessage(final String message);

    public void printCollection(T[] array) ;

}
