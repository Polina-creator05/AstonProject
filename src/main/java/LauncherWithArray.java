import action.*;

public class LauncherWithArray {
    public static void main(final String[] args) {
               Action[] actions = {new ChoiceClass(),
                new ChoiceLength(),
                new ChoiceWayFill(),
                new ChoiceSort(),
                new ChoiceSearch(),
                new ChoiceOutputEXP(),
                new ChoiceContinue()};


        do {
            for (int i = 0; i < actions.length - 1; i++) {
                actions[i].call();
            }

            Action action = new ChoiceContinue();
            action.call();

        } while (!ChoiceContinue.inputContinue.equalsIgnoreCase("1"));
    }
}

