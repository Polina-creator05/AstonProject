package console;

public class Verificator {

    public static boolean verifayUserInput(final String input, int b) {
        if (input.length() == 1) {
            final int ch = Integer.valueOf(input);
            return ch >=1 && ch <= b;
        }
        return false;
    }

}
