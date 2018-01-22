package com.nahtredn.entities;

import android.content.Context;

/**
 * Created by Me on 21/01/2018.
 */

public class Section {
    private String title;
    private String description;
    private int id;
    private Context context;
    private java.lang.Class endActivity;

    public Section() {}

    public Section(String title, String description, int id, Context context, java.lang.Class endActivity) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.context = context;
        this.endActivity = endActivity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Class getEndActivity() {
        return endActivity;
    }

    public void setEndActivity(Class endActivity) {
        this.endActivity = endActivity;
    }
}
