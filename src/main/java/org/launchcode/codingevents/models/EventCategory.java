package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class EventCategory {

    @Id
    @GeneratedValue
    private int id;

    @Size(min=3, max=50, message="Name must be between 3-50 characters")
    private String name;

    public EventCategory(int id, String name){
        this.id=id;
        this.name=name;
    }

    public EventCategory() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
