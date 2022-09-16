package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //then create a skill controller that mirrors employer controller in function
}