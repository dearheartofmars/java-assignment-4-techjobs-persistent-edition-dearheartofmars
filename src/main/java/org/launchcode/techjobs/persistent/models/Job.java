package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    private Employer Employer;
    @ManyToMany
    private List<Skill>  skills;
    public Job() {
    }
    public Job(Employer anEmployer, List<Skill>  someSkills) {
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
    public List<Skill>  getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
