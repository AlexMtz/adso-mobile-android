package com.nahtredn.entities;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by Me on 21/01/2018.
 */

public class Reference extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private String name;
    @Required
    private String lastName;
    private Address address;
    @Required
    private String job;
    @Required
    private String phone;
    @Required
    private String timeToMeetHim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTimeToMeetHim() {
        return timeToMeetHim;
    }

    public void setTimeToMeetHim(String timeToMeetHim) {
        this.timeToMeetHim = timeToMeetHim;
    }
}
