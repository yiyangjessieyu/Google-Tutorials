package seng202;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import javafx.scene.control.TextField;
import java.lang.annotation.Target;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Text actionTarget;

    @FXML
    private Button signInButton;

    public void login() {
        // Ensure the user has entered some text before preceeding to the next step.
        if (!usernameField.getText().isEmpty()) {
            // Get that text and put it inside a preformatted message.
            String loginText = String.format("Thanks for logging in, %s!", usernameField.getText());
            // Set the hidden Text node value to be that string.
            actionTarget.setText(loginText);
            // Show the Text node.
            actionTarget.setVisible(true);
        }
    }
}


