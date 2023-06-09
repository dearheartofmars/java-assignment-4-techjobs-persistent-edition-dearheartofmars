package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String location;

    public Employer(){}
    public String getLocation() {
        return location;
    }

    @OneToMany(mappedBy = "employerRepository")
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public void setLocation(String location) {
        this.location = location;
    }
}


