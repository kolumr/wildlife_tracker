import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
public class Sighting {
    private String location;
    private String rangerName;
    private LocalDateTime sightingTime;
    private int id;

    public Sighting(int id, String location, String rangerName, LocalDateTime sightingTime) {
        this.id = id;
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
