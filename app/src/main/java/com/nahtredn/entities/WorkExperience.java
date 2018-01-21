package com.nahtredn.entities;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by Me on 21/01/2018.
 */

public class WorkExperience extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private String type;
    @Required
    private String companyName;
    @Required
    private String jobTitle;
    private Date startJob;
    private Date endJob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getStartJob() {
        return startJob;
    }

    public void setStartJob(Date startJob) {
        this.startJob = startJob;
    }

    public Date getEndJob() {
        return endJob;
    }

    public void setEndJob(Date endJob) {
        this.endJob = endJob;
    }
}
