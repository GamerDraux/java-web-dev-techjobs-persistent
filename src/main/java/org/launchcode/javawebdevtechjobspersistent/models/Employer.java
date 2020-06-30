package org.launchcode.javawebdevtechjobspersistent.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message="Location must be provided")
    @Length(min = 3, max=55, message="Location must be between 3 and 55 characters")
    public String location;

    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL)
    @Valid
    private final List<Job> jobs = new ArrayList<>();

    public Employer(String location){
        super();
        this.location = location;
    }

    public Employer(){};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
