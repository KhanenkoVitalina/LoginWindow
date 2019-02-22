package com.training;

import com.training.Controller.Controller;
import com.training.Model.Note;
import com.training.Vie.View;

public class Main {
    public static void main(String[] args) {
        Controller controller =
                new Controller(new Note(), new View());
        controller.processUser();



    }

}
