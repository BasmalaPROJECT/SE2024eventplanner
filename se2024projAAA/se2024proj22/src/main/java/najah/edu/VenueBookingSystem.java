package najah.edu;
import java.util.HashMap;
import java.util.Map;

public class VenueBookingSystem {
    private Map<String, Boolean> venueAvailability;

    public VenueBookingSystem() {
        this.venueAvailability = new HashMap<>();
        // Initialize venue availability
        venueAvailability.put("Venue A", true);
        venueAvailability.put("Venue B", true);
        venueAvailability.put("Venue C", true);
    }

    public boolean checkVenueAvailability(String venueName) {
        return venueAvailability.getOrDefault(venueName, false);
    }

    public void bookVenue(String venueName) {
        if (venueAvailability.containsKey(venueName) && venueAvailability.get(venueName)) {
            venueAvailability.put(venueName, false);
            System.out.println("Venue " + venueName + " booked successfully.");
        } else {
            System.out.println("Venue " + venueName + " is not available for booking.");
        }
    }

    public void releaseVenue(String venueName) {
        if (venueAvailability.containsKey(venueName) && !venueAvailability.get(venueName)) {
            venueAvailability.put(venueName, true);
            System.out.println("Venue " + venueName + " released successfully.");
        } else {
            System.out.println("Venue " + venueName + " is not currently booked.");
        }
    }
     
    public void initialize() {
        System.out.println("Venue booking system initialized.");
    }

}