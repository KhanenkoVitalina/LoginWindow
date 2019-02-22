package com.training.Vie;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.training.Vie.TextConstant.*;

public class View {
    static String MESSAGE_BUNDLE_NAME = "message";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGE_BUNDLE_NAME,
            new Locale("en"));

    public void printMessage(String message){
        System.out.println(message);
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT),
                bundle.getString(INPUT),
                bundle.getString(message)));
    }


}
