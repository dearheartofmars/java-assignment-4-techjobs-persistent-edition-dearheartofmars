package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
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

    @ManyToMany(mappedBy = "employerRepository")
    private  List<Job> jobs = new ArrayList<>();

    public void setLocation(String location) {
        this.location = location;
    }
}


