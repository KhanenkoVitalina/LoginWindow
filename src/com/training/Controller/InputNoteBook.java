package com.training.Controller;

import com.training.Vie.TextConstant;
import com.training.Vie.View;

import java.util.*;

import static com.training.Controller.Regex.*;
import static com.training.Vie.TextConstant.*;
import static com.training.Vie.TextConstant.COMMENT;
import static com.training.Vie.TextConstant.EMAIL;
import static com.training.Vie.TextConstant.INDEX;

public class InputNoteBook {
    private Map<String, String> fullUserDataList;
    private Scanner scanner;
    private View view;


    public InputNoteBook(View view, Scanner scanner){
        this.view = view;
        this.scanner = scanner;
    }
    private boolean getLocale(){
        return true;
    }


    public Map getUserInputMap() {
        UtilityController utilityController =
                new UtilityController(view, scanner);
        fullUserDataList = new HashMap<>();
//        String firstName = utilityController.inputStringValueWithScanner(FIRST_NAME, SIMPLE_NAME_UA_REGEX);
//        String lastName = utilityController.inputStringValueWithScanner(LAST_NAME, SIMPLE_NAME_UA_REGEX);
//        String familyName = utilityController.inputStringValueWithScanner(FAMILY_NAME, SIMPLE_NAME_UA_REGEX);
        String nickName = utilityController.inputStringValueWithScanner(NICK_NAME, LOWER_CASE_AND_NUM_REGEX);
//        String comment = utilityController.inputStringValueWithScanner(COMMENT, Regex.COMMENT);
//        String group = utilityController.inputStringValueWithScanner(GROUP, SIMPLE_NAME_UA_REGEX);
//        String phoneNumber = utilityController.inputStringValueWithScanner(PHONE_NUM, PHOME_NUMBER);
//        String homePhoneNumber = utilityController.inputStringValueWithScanner(HOME_PHONE_NUM, PHOME_NUMBER);
//        String email = utilityController.inputStringValueWithScanner(EMAIL, Regex.EMAIL);
//        String index = utilityController.inputStringValueWithScanner(INDEX, Regex.INDEX);
//        String location = utilityController.inputStringValueWithScanner(LOCATION, SIMPLE_NAME_UA_REGEX);
//        String street = utilityController.inputStringValueWithScanner(STREET, SIMPLE_NAME_UA_REGEX);
//        String building = utilityController.inputStringValueWithScanner(BUILDING_NUM, ANY_NUMBER_REGEX);
//        String apartNumber = utilityController.inputStringValueWithScanner(APART_NUM, ANY_NUMBER_REGEX);
//        fullUserDataList.put(FIRST_NAME, firstName);
//        fullUserDataList.put(LAST_NAME, firstName);
//        fullUserDataList.put(FAMILY_NAME, firstName);
        fullUserDataList.put(View.bundle.getString(TextConstant.NICK_NAME), nickName);
//        fullUserDataList.put(COMMENT, firstName);
//        fullUserDataList.put(GROUP, firstName);
//        fullUserDataList.put(PHONE_NUM, firstName);
//        fullUserDataList.put(HOME_PHONE_NUM, firstName);
//        fullUserDataList.put(EMAIL, firstName);
//        fullUserDataList.put(INDEX, firstName);;
//        fullUserDataList.put(LOCATION, firstName);
//        fullUserDataList.put(STREET, firstName);
//        fullUserDataList.put(BUILDING_NUM, firstName);
//        fullUserDataList.put(APART_NUM, firstName);;
        return fullUserDataList;
    }



}
