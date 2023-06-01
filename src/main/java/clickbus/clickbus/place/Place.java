package clickbus.clickbus.place;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Place {
    private UUID id;
    private String name;
    private String slug;
    private String city;
    private String state;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Place(String name, String slug, String city, String state) {
        this.name = name;
        this.slug = slug;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
