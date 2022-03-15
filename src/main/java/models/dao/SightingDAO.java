package models.dao;

import models.pojos.Sightings;

import java.time.LocalDateTime;
import java.util.List;

public interface SightingDAO {
    //create
    void add(Sightings sighting);
    //read
    List<Sightings> getAll();
    //update
    void update(int id, String name, String location, String rangerName, LocalDateTime sightingTime);
    //delete
    void deleteById(int id);
    void clearAll();
}
