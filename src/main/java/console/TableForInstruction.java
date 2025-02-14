package console;

public class TableForInstruction {
    private static final String[][] tableClass = {
            {"  1   ", "  2   ", "  3   "},
            {"Animal", "Barrel", "Person"}
    };

    private static final String[][] tableFill = {
            {"   1    ", "   2    ", "   3  "},
            {"Из файла", "Рандомно", "Вручную"}
    };

    private static final String[][] tableSort = {
            {"   1   ", "   2   "},
            {"Базовая", "Чет-неч"}
    };

    private static final String[][] tableContinue = {
            {"    1    ", "     2    "},
            {"Завершить", "Продолжить"}
    };

    private static final String[][] tableSearch = {
            {"    1    ", "     2    "},
            {"    Да   ", "    Нет   "}
    };

    private static final String[][] tableWrite = {
            {"    1    ", "     2    "},
            {"    Да   ", "    Нет   "}
    };

    public static String[][] getTableClass() {
        return tableClass;
    }

    public static String[][] getTableFill() {
        return tableFill;
    }

    public static String[][] getTableSort() {
        return tableSort;
    }

    public static String[][] getTableContinue() {
        return tableContinue;
    }

    public static String[][] getTableSearch() {
        return tableSearch;
    }

    public static String[][] getTableWrite() {
        return tableWrite;
    }
}
