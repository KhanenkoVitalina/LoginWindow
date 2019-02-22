package com.training.Controller;

import com.training.Vie.View;
import java.util.Scanner;

public class UtilityController {
    private View view;
    private Scanner scanner;
    public UtilityController(View view, Scanner scanner){
        this.view = view;
        this.scanner = scanner;
    }
    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() &&
                (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }

}
