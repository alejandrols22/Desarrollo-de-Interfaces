package primerospasos_ejercicio6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SimpleController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Text loginResultText;

    @FXML
    protected void handleLoginAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        loginResultText.setText("Username: " + username + ", Password: " + password);
    }
}