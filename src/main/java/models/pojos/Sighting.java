package models.pojos;

import models.pojos.Animal;

import java.time.LocalDateTime;
public class Sighting extends Animal {
    private String location;
    private String rangerName;
    private LocalDateTime sightingTime;
    private int id;

    public Sighting (int id, String name,String location, String rangerName, LocalDateTime sightingTime) {
        super(id,name);
        this.location = location;
        this.rangerName = rangerName;
        this.sightingTime = java.time.LocalDateTime.now();

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRangerName() {
        return rangerName;
    }

    public void setRangerName(String rangerName) {
        this.rangerName = rangerName;
    }

    public LocalDateTime getSightingTime() {
        return sightingTime;
    }

    public void setSightingTime(LocalDateTime sightingTime) {
        this.sightingTime = sightingTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
