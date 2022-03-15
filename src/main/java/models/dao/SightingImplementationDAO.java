package models.dao;

import models.pojos.Sightings;
import org.sql2o.Sql2o;

import java.util.List;

public class SightingImplementationDAO implements SightingDAO{
    private final Sql2o sql2o;

    public SightingImplementationDAO(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Sightings sighting) {

    }

    @Override
    public List<Sightings> getAll() {
        return null;
    }

    @Override
    public void update(int id, String name, String location, String rangerName) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
}
