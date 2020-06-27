package org.launchcode.javawebdevtechjobspersistent.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message="Description must be provided")
    @Length(min = 3, max=1000, message="Description must be between 3 and 1000 characters")
    public String description;

    public Skill (String description){
        super();
        this.description=description;
    }

    public Skill (){};

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}