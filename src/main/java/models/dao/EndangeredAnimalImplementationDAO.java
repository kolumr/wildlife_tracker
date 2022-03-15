package models.dao;

import models.pojos.EndangeredAnimals;
import org.sql2o.Sql2o;

import java.util.List;

public class EndangeredAnimalImplementationDAO implements EndangeredAnimalDAO{
    private final Sql2o sql2o;
    public EndangeredAnimalImplementationDAO(Sql2o sql2o){
        this.sql2o = sql2o;
    }
    @Override
    public void add(EndangeredAnimals endangeredAnimal) {

    }

    @Override
    public List<EndangeredAnimals> getAll() {
        return null;
    }

    @Override
    public void update(int id, String name, String health, int age) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
}
