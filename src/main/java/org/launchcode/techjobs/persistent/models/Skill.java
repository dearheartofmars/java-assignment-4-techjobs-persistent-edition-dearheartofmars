package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


@ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>() {};

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    private List<Skill> skills = new ArrayList<>();
    @NotBlank
    @Size(max = 150, message = "Skill description is limited to 150 characters")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToOne(mappedBy = "skillRepository")
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}