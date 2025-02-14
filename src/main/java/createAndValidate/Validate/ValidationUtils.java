package createAndValidate.Validate;

import model.Sex;


public class ValidationUtils {
    public static boolean isValidNumber(String input) {
        try {
            int num = Integer.parseInt(input);
            return num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    public static boolean isValidString(String input) {
        return input != null && !input.isEmpty();
    }

    public static boolean isValidSex(String input) {
        try {
            Sex.valueOf(input.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}

