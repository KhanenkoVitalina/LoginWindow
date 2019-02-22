package com.training.Model;

public enum DBmodel {
    USER01("vasya_pupkin@gmail.com","vasya"),
    USER02("masha_ivanova@ukr.net","mashynya"),
    USER03("katya123@ukr.net","katrin");
    private String email;
    private String nickName;

    DBmodel(String email, String nickName) {
        this.email = email;
        this.nickName = nickName;
    }
    public String getEmail(){
        return email;
    }
    public String getNickName(){
        return nickName;
    }

}
