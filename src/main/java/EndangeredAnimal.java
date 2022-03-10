public class EndangeredAnimal {
   private int id;
   private String name;
   private String health;
   private int age;

    public EndangeredAnimal(int id, String name, String health, int age){
        this.id = id;
        this.name = name;
        this.health = health;
        this.age = age;
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
}
