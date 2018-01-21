package com.nahtredn.entities;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by Me on 21/01/2018.
 */

public class User extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private String name;
    private String middleName;
    @Required
    private String lastName;
    @Required
    private Date birthDate;
    private int age;
    private String genre;
    private String liveWith;
    @Required
    private String civilStatus;
    private Address address;
    private Documentation documentation;
    private RealmList<Study> studies;
    private RealmList<CurrentStudy> currentStudies;
    private RealmList<WorkExperience> workExperiences;
    @Required
    private RealmList<Reference> references;

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLiveWith() {
        return liveWith;
    }

    public void setLiveWith(String liveWith) {
        this.liveWith = liveWith;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Documentation getDocumentation() {
        return documentation;
    }

    public void setDocumentation(Documentation documentation) {
        this.documentation = documentation;
    }

    public RealmList<Study> getStudies() {
        return studies;
    }

    public void setStudies(RealmList<Study> studies) {
        this.studies = studies;
    }

    public RealmList<CurrentStudy> getCurrentStudies() {
        return currentStudies;
    }

    public void setCurrentStudies(RealmList<CurrentStudy> currentStudies) {
        this.currentStudies = currentStudies;
    }

    public RealmList<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(RealmList<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public RealmList<Reference> getReferences() {
        return references;
    }

    public void setReferences(RealmList<Reference> references) {
        this.references = references;
    }
}
