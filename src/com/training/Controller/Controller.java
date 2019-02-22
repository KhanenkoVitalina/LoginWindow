package com.training.Controller;

import com.training.Model.DataAlreadyExistsException;
import com.training.Model.Note;
import com.training.Vie.TextConstant;
import com.training.Vie.View;
import java.util.Map;
import java.util.Scanner;

import static com.training.Vie.TextConstant.SAVED_NICK_WARNING;

public class Controller {
    private Note model;
    private View view;

    public Controller(Note model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser()  {
        Scanner sc = new Scanner(System.in);
        InputNoteBook inputNoteNoteBook =
                new InputNoteBook(view, sc);
        Map fullUserDataList = inputNoteNoteBook.getUserInputMap();
        model.setFullUserDataList(fullUserDataList);
        try {
            model.save();
        } catch (DataAlreadyExistsException e) {
            e.getExistingElement();
            view.printStringInput(SAVED_NICK_WARNING);
            processUser();
        }

    }

}
