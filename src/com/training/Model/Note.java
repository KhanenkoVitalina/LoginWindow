package com.training.Model;

import com.training.Vie.TextConstant;
import com.training.Vie.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Note {
    private Map<String,String> fullUserDataList = new HashMap();

    public void save() throws DataAlreadyExistsException {
        String identifier = fullUserDataList.get(View.bundle.getString(TextConstant.NICK_NAME));
        for(DBmodel dbmodel: DBmodel.values()) {
            if (identifier.equals(dbmodel.getNickName())) {
                DataAlreadyExistsException e = new DataAlreadyExistsException("Element cant be added");
                 e.setExistingElemtnt(identifier);
                throw e;
            }
        }
    }

    public Map getFullUserDataList() {
        return fullUserDataList;
    }

    public void setFullUserDataList(Map fullUserDataList) {
        this.fullUserDataList = fullUserDataList;
    }
}
