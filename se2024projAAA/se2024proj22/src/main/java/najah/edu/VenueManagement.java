package najah.edu;
import java.util.ArrayList;
import java.util.List;

public class VenueManagement {
    private static List<Venue> venues = new ArrayList<>();

    public static void addVenue(String name, int capacity, List<String> amenities, String pricing) {
        venues.add(new Venue(name, capacity, amenities, pricing));
        System.out.println("Venue \"" + name + "\" successfully added.");
    }
    public void grantAccess() {
        System.out.println("Access granted to venue management system.");
    }    
}