package najah.edu.acceptance_test;

import najah.edu.Serviceprovider;
import najah.edu.Event;
import java.util.Scanner;

public class CommandLineInterface {
    public static String main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Serviceprovider s = new Serviceprovider();

        System.out.println("Welcome to the Event Management System!");
        System.out.println("Select an option:");
        System.out.println("1. Add Event");
        System.out.println("2. Update Event");
        System.out.println("3. Delete Event");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Adding Event...");
                Event event1 = new Event();
                Event event2 = new Event();
                s.addevent(event1);
                s.addevent(event2);
                break;
            case 2:
                System.out.println("Updating Event...");
                Event eventToUpdate = new Event();
                s.updateevent(eventToUpdate, 1);
                break;
            case 3:
                System.out.println("Deleting Event...");
                s.deleteevent(2);
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

        scanner.close();
		return null;
    }
}
