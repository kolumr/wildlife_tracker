package models.dao;

import models.pojos.Animals;
import org.sql2o.Sql2o;

import java.util.List;

public class AnimalImplementationDAO implements AnimalDAO{
    private final Sql2o sql2o;
    public AnimalImplementationDAO(Sql2o sql2o){
        this.sql2o = sql2o;
    }
    @Override
    public void add(Animals animal) {

    }

    @Override
    public List<Animals> getAll() {
        return null;
    }

    @Override
    public void update(int id, String name) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
}
