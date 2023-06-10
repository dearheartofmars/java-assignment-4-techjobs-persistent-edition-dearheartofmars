package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{

    private Employer Employer;
    @ManyToMany
    private String skills;
    public Job() {
    }
    public Job(Employer anEmployer, String someSkills) {
        super();
        this.Employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    @ManyToOne
    public Employer getEmployer() {
        return Employer;
    }

    public void setEmployer(Employer Employer) {
        this.Employer = Employer;
    }
    @ManyToMany
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
