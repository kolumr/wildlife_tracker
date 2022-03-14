package models.pojos;

import models.pojos.Animal;

import java.util.Objects;

public class EndangeredAnimal extends Animal {
   private String health;
   private int age;

    public EndangeredAnimal (int id,String name,String health, int age){
        super(id,name);
        this.health = health;
        this.age = age;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EndangeredAnimal that = (EndangeredAnimal) o;
        return age == that.age && health.equals(that.health);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), health, age);
    }
}
