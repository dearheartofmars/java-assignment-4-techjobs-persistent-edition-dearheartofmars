package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank
    @Size(max = 150, message = "Skill description is limited to 150 characters")
    private String description;

    public String getLocation() {
        return description;
    }

    public void setLocation(String location) {
        this.description = location;
    }
}