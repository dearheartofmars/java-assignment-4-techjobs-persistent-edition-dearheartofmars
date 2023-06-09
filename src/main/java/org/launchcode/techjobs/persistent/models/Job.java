package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{

    private String Employer;
    private String skills;

    public Job() {
    }

    public Job(String anEmployer, String someSkills) {
        super();
        this.Employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    @ManyToOne
    public String getEmployer() {
        return Employer;
    }

    public void setEmployer(String Employer) {
        this.Employer = Employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
