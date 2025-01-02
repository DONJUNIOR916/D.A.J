package com.example.oop_page8;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button applyLoanButton;

    @FXML
    private Button backButton;

    @FXML
    private Label interestRateLabel;

    @FXML
    private Label loanAmountLabel;

    @FXML
    private Label totalLabel;

    @FXML
    public void initialize() {
        // Load loan information for the user
        loadLoanInformation();

        // Set up button actions
        applyLoanButton.setOnAction(event -> applyToDashboard());
        backButton.setOnAction(event -> goBackToDashboard());
    }

    private void loadLoanInformation() {
        // Simulated loan data (this would typically come from a database or service)
        boolean hasActiveLoan = true; // Simulate whether the user has an active loan

        loanAmountLabel.setText("$10,000"); // Example data
        interestRateLabel.setText("10%");
        totalLabel.setText("$11,000");
    }

    private void applyToDashboard() {
        // Logic to navigate to the dashboard
        System.out.println("Navigating to dashboard.");
        Stage stage = (Stage) applyLoanButton.getScene().getWindow();
        stage.close(); // Close the loan information window
    }

    private void goBackToDashboard() {
        // Logic to navigate back to the dashboard
        System.out.println("Navigating back to dashboard.");
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close(); // Close the loan information window
    }
}
