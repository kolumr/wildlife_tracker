package models.pojos;

import java.util.Objects;

public class Animal {
    protected int id;
    protected String name;

    public Animal (int id, String name) {
        this.id = id;
        this.name = name;
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
