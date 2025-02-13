package console;

import action.ChoiceClass;
import action.ChoiceLength;

public class Instruction {
    private final static String messageClass = "Введите цифру от 1 до 3 в соответствии с типом данных, подлежащих сортировке согласно таблице";

    private final static String messageFill = "Введите цифру от 1 до 3 в соответствии с желаемым вариантом заполнения массива данных согласно таблице";

    private final static String messageSort = "Введите цифру от 1 до 2 в соответствии с желаемым типом сортировки согласно таблице";

    private final static String messageLenght = "Введите количество объектов, подлежащих обработке";

    private final static String messageContinue = "Желаете завершить программу. Введите цифры от 1 до 2 согласно таблице";

    private final static String messageReadFromFile = "Укажите путь к файлу, из которого необходимо считать данные для заполнения массива";

    private  final static String messageReadFromConsole = "Укажите данные для заполнения массива, " +
                    "перечисляя характеристики объектов типа %s через запятую, \n" +
                    "начиная каждый с новой строки." +
                    " Количество строк, которое Вам необходимо заполнить %d";

    private final static String messageSearch = "Желаете проверить наличие конкретного объекта в массиве данных. " +
            "Введите цифры от 1 до 2 согласно таблице";

    private final static String messageObject= "Укажите  объект, который желаете найти, \n" +
            "перечисляя характеристики объекта типа %s через запятую";

    private final static String messageWriteToFile = "Желаете записать результаты сортировки в файл." +
            "Введите цифры от 1 до 2 согласно таблице";

    public static String getMessageClass() {
        return messageClass;
    }

    public static String getMessageFill() {
        return messageFill;
    }

    public static String getMessageSort() {
        return messageSort;
    }

    public static String getMessageLenght() {
        return messageLenght;
    }

    public static String getMessageContinue() {
        return messageContinue;
    }

    public static String getMessageReadFromFile() {
        return messageReadFromFile;
    }


    public static String getMessageReadFromConsole(Integer arrayLength,  Class<?> clacc) {
       return String.format(messageReadFromConsole, clacc,arrayLength);

    }

    public static String getMessageSearch() {
        return messageSearch;
    }

    public static String getMessageObject(Class<?> clacc) {
        String currentClacc= clacc.toString();
        int index = currentClacc.indexOf(".");
        return String.format(messageObject, currentClacc.substring(index+1));
    }

    public static String getMessageWriteToFile() {
        return messageWriteToFile;
    }
}
