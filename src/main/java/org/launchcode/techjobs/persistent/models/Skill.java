package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Skill extends AbstractEntity {

    private String description;

//    @OneToMany(mappedBy = "skill")
//    private List<Job> jobs = new ArrayList<>();

    public Skill(){}

    public Skill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


//    @Override
//    public String toString() {
//        return getName() + ": " + description;
//    }
}