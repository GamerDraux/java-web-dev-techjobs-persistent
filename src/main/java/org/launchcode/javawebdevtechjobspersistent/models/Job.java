package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    @NotNull(message="Employer is Required")
    private Employer employer;

    @ManyToMany
    @NotNull(message="At least one skill is required.  If no skills are listed, please create one using the 'Add Skill' link")
    private  List<Skill> skills = new ArrayList<>();

    public Job(Employer anEmployer) {
        super();
        this.employer = anEmployer;
    }

    public Job() {
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
