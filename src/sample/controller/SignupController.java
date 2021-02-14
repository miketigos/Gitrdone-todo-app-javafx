package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import sample.database.DatabaseHandler;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField signupLastName;

    @FXML
    private JFXTextField signupFirstName;

    @FXML
    private JFXTextField signupUsername;

    @FXML
    private JFXButton signupButton;

    @FXML
    private JFXPasswordField signupPassword;

    @FXML
    void initialize() {
        // initialize instance of databaseHandler
        DatabaseHandler databaseHandler = new DatabaseHandler();

        signupButton.setOnAction(event -> {
            // invoke the signUpUser method
            databaseHandler.signUpUser(signupFirstName.getText(), signupLastName.getText(),
                    signupUsername.getText(), signupPassword.getText());
        });
    }
}
