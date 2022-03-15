import org.sql2o.Sql2o;

public class App {
    public static void main(String[] args) {

        String connectionString = "jdbc:postgresql://localhost:5432/wildlife_tracker"; // connect to postgres test database
        Sql2o sql2o = new Sql2o(connectionString, "postgres", "");
    }
}
