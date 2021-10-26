package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    @JoinColumn(name = "employer_id")
    private List<Skill> skills = new ArrayList<>();

//    does job need to take in skills as a parameter? does it need to initialize skills?
    public Job(Employer anEmployer, List<Skill> skills) {
        super();
        this.employer = anEmployer;
        this.skills = skills;
    }

    public Job() {
    }

    // Getters and setters
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
