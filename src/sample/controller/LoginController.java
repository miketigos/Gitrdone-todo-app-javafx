package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton loginSignupButton;

    @FXML
    private JFXTextField loginUsername;

    @FXML
    private JFXPasswordField loginPassword;

    @FXML
    private JFXButton loginButton;

    @FXML
    void initialize() {

        String loginUname = loginUsername.getText().trim();
        String loginPwd = loginPassword.getText().trim();

        loginSignupButton.setOnAction(event -> {
            // take users to signup screen
            loginSignupButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/signup.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

            //showAndWait() method will set the new window and disable interaction until
            // it is loaded and the loop is running, will not work on primary stage,
            // a stage that is already in a loop,

        });

        loginButton.setOnAction(event -> {
            if (!loginUname.equals("") || !loginPwd.equals(""))
            loginUser(loginUname, loginPwd);
        });
    }

    private void loginUser(String userName, String password) {
        // check in users table to see if users exists
        // if true, we will move to the addItem view


    }
}
