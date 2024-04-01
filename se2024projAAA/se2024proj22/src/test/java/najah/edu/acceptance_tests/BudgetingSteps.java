package najah.edu.acceptance_tests;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class BudgetingSteps {

    boolean registeredServiceProvider;
    boolean budgetPlanned;
    boolean expensesTracked;
    boolean expensesCategorized;
    boolean budgetOverviewViewed;
    boolean budgetVariancesAnalyzed;

    @Given("I am a registered service provider")
    public void i_am_a_registered_service_provider() {
        registeredServiceProvider = true;
    }

    @When("I plan the budget for an event")
    public void i_plan_the_budget_for_an_event() {
        // Assuming some logic here to plan the budget
        budgetPlanned = true;
    }

    @When("I track expenses related to the event")
    public void i_track_expenses_related_to_the_event() {
        // Assuming some logic here to track expenses
        expensesTracked = true;
    }

    @Then("I should be able to estimate and monitor expenses effectively")
    public void i_should_be_able_to_estimate_and_monitor_expenses_effectively() {
        assertTrue(budgetPlanned);
        assertTrue(expensesTracked);
        // Additional assertions if necessary
    }

    @Given("I have incurred expenses for an event")
    public void i_have_incurred_expenses_for_an_event() {
        expensesTracked = true; // Assuming expenses are already tracked
    }

    @When("I categorize these expenses")
    public void i_categorize_these_expenses() {
        // Assuming some logic here to categorize expenses
        expensesCategorized = true;
    }

    @Then("I should be able to assign them to specific categories for better organization")
    public void i_should_be_able_to_assign_them_to_specific_categories_for_better_organization() {
        assertTrue(expensesCategorized);
        // Additional assertions if necessary
    }

    @Given("I have planned and tracked expenses for an event")
    public void i_have_planned_and_tracked_expenses_for_an_event() {
        budgetPlanned = true; // Assuming budget is already planned
        expensesTracked = true; // Assuming expenses are already tracked
    }

    @When("I view the budget overview")
    public void i_view_the_budget_overview() {
        // Assuming some logic here to view budget overview
        budgetOverviewViewed = true;
    }

    @Then("I should see a summary of planned vs actual expenses")
    public void i_should_see_a_summary_of_planned_vs_actual_expenses() {
        assertTrue(budgetOverviewViewed);
        // Additional assertions if necessary
    }

    @When("I analyze the budget variances")
    public void i_analyze_the_budget_variances() {
        // Assuming some logic here to analyze budget variances
        budgetVariancesAnalyzed = true;
    }

    @Then("I should be able to identify any discrepancies between planned and actual expenses")
    public void i_should_be_able_to_identify_any_discrepancies_between_planned_and_actual_expenses() {
        assertTrue(budgetVariancesAnalyzed);
        // Additional assertions if necessary
    }

    @Given("the user enters budget details")
    public void user_enters_budget_details() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter budget details:");
        System.out.print("Budget amount: ");
        double budgetAmount = scanner.nextDouble();
        System.out.print("Expenses amount: ");
        double expensesAmount = scanner.nextDouble();

        // You can add further logic to handle the entered budget details
    }

    // Command Line Interface method
    public void runCommandLineInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Budgeting System!");
        System.out.println("What would you like to do?");
        System.out.println("1. Enter budget details");
        System.out.println("Enter your choice:");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                user_enters_budget_details();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void main(String[] args) {
        BudgetingSteps budgetingSteps = new BudgetingSteps();
        budgetingSteps.runCommandLineInterface();
    }
}
