package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import najah.edu.acceptance_test.CommandLineInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

public class CalendarSteps {
    private ByteArrayInputStream in;
    private String outContent;
    private final Scanner scanner = new Scanner(System.in);

    @Given("I am a registered user")
    public void i_am_a_registered_user() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I access the calendar view")
    public void i_access_the_calendar_view() {
        String input = "1"; // Simulate user input for accessing the calendar view
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        outContent = CommandLineInterface.main(null);
    }

    @Then("I should see a display of upcoming events and important dates")
    public void i_should_see_a_display_of_upcoming_events_and_important_dates() {
        String expectedOutput = "Accessing the calendar view...";
        assertEquals(expectedOutput, outContent.trim());
    }

    @Given("I have tasks, deadlines, and appointments related to event planning")
    public void i_have_tasks_deadlines_and_appointments_related_to_event_planning() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I use the scheduling tools")
    public void i_use_the_scheduling_tools() {
        String input = "2"; // Simulate user input for using scheduling tools
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        outContent = CommandLineInterface.main(null);
    }

    @Then("I should be able to coordinate tasks, deadlines, and appointments effectively")
    public void i_should_be_able_to_coordinate_tasks_deadlines_and_appointments_effectively() {
        String expectedOutput = "Using the scheduling tools...";
        assertEquals(expectedOutput, outContent.trim());
    }

    @Given("there are upcoming events, deadlines, and tasks")
    public void there_are_upcoming_events_deadlines_and_tasks() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I set reminders and notifications")
    public void i_set_reminders_and_notifications() {
        String input = "3"; // Simulate user input for setting reminders and notifications
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        outContent = CommandLineInterface.main(null);
    }

    @Then("I should receive timely notifications about upcoming events, deadlines, and tasks")
    public void i_should_receive_timely_notifications_about_upcoming_events_deadlines_and_tasks() {
        String expectedOutput = "Setting reminders and notifications...";
        assertEquals(expectedOutput, outContent.trim());
    }

    @Given("I have set reminders and notifications")
    public void i_have_set_reminders_and_notifications() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("the time for an upcoming event, deadline, or task approaches")
    public void the_time_for_an_upcoming_event_deadline_or_task_approaches() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I should receive reminders and notifications accordingly")
    public void i_should_receive_reminders_and_notifications_accordingly() {
        // Write code here that turns the phrase above into concrete actions
    }

    public void runCommandLineInterface() {
        try {
            System.out.println("Welcome to the Calendar System!");
            System.out.println("What would you like to do?");
            System.out.println("1. Access the calendar view");
            System.out.println("2. Use the scheduling tools");
            System.out.println("3. Set reminders and notifications");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt(); // تحصل على اختيار المستخدم من خلال scanner
            switch (choice) {
                case 1:
                    i_access_the_calendar_view();
                    i_should_see_a_display_of_upcoming_events_and_important_dates();
                    break;
                case 2:
                    i_use_the_scheduling_tools();
                    i_should_be_able_to_coordinate_tasks_deadlines_and_appointments_effectively();
                    break;
                case 3:
                    i_set_reminders_and_notifications();
                    i_should_receive_timely_notifications_about_upcoming_events_deadlines_and_tasks();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } finally {
            scanner.close(); // ينبغي دائمًا إغلاق Scanner بعد الانتهاء من استخدامه
        }
    }

    public static void main(String[] args) {
        CalendarSteps calendarSteps = new CalendarSteps();
        calendarSteps.runCommandLineInterface();
    }
}
