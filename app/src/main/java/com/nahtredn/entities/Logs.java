package com.nahtredn.entities;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by Me on 21/01/2018.
 */

public class Logs extends RealmObject {
    private Date date;
    private String message;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
