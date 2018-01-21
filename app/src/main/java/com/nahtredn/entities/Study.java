package com.nahtredn.entities;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by Me on 21/01/2018.
 */

public class Study extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private String level;
    @Required
    private String courseName;
    @Required
    private String institute;
    @Required
    private String state;
    private Date startStudy;
    private Date endStudy;
    @Required
    private String titleReceived;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getStartStudy() {
        return startStudy;
    }

    public void setStartStudy(Date startStudy) {
        this.startStudy = startStudy;
    }

    public Date getEndStudy() {
        return endStudy;
    }

    public void setEndStudy(Date endStudy) {
        this.endStudy = endStudy;
    }

    public String getTitleReceived() {
        return titleReceived;
    }

    public void setTitleReceived(String titleReceived) {
        this.titleReceived = titleReceived;
    }
}
