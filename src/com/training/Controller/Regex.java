package com.training.Controller;

public interface Regex {
    String SIMPLE_NAME_UA_REGEX = "[А-ЯЇЄІ[^ЫЪЭ]][а-яїіє\'&&[^ыъэ]]+";
    String LOWER_CASE_AND_NUM_REGEX = "[a-z0-9]{3,20}";
    String COMMENT = "[А-ЯІЇЄа-яїіє'.,!?*0-9&&[^ЫЪЭыъэ]]{0,50}";
    String PHOME_NUMBER = "0[0-9]{2}-[0-9]{4}-[0-9]{3}";
//    String HOME_NUMBER = "[0-9]-[0-9]{2}-{0-9]{2}";
   String EMAIL = "^[a-z0-9._%]+@[a-z0-9]+\\.[a-z]{2,6}$";
    String INDEX = "[0-9]{5};";
    String ANY_NUMBER_REGEX = "[0-9]{1-4}";

}
