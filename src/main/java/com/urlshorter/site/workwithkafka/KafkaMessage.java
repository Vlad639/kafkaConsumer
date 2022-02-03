package com.urlshorter.site.workwithkafka;

public class KafkaMessage {

    private  String login;
    private  String action;
    private  String object;

    public KafkaMessage(String login, String action, String object) {
        this.login = login;
        this.action = action;
        this.object = object;
    }

    public KafkaMessage(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "KafkaMessage {login: " + login + ", action: " + action + ", object: " + object + "}";
    }
}
