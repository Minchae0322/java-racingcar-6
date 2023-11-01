package racingcar.util;

import racingcar.exception.Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Parser {

    public static List<String> splitName(String userInput, String regex) {
        String[] cutIntoComma = userInput.split(regex);
        List<String> nameList = new ArrayList<>(Arrays.asList(cutIntoComma));
        Validator.validateName(nameList);

        return nameList;
    }
}
