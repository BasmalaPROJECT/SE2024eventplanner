package najah.edu;
import java.util.ArrayList;
import java.util.List;

public class Venue {
    private String name;
    private int capacity;
    private List<String> amenities;
    private String pricing;

    public Venue(String name, int capacity, List<String> amenities, String pricing) {
        this.name = name;
        this.capacity = capacity;
        this.amenities = amenities;
        this.pricing = pricing;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public String getPricing() {
        return pricing;
    }
}    


