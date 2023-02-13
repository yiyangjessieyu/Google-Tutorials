package seng202;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class SampleApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

//    @Override
//    public void start(Stage primaryStage) {
//
//        GridPane gridPane = new GridPane();
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.setHgap(10);
//        gridPane.setVgap(10);
//        gridPane.setPadding(new Insets(25, 25, 25, 25));
//
//        Text sceneTitle = new Text("Welcome!");
//        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//        gridPane.add(sceneTitle, 0, 0, 2, 1); // Col 0, Row 0, ColSpan 2, RowSpan 1
//
//        Label username = new Label("Username:");
//        gridPane.add(username, 0, 1); // Col 0, Row 1
//
//        TextField usernameTextField = new TextField();
//        gridPane.add(usernameTextField, 1, 1); // Col 1, Row 1
//
//        Label password = new Label("Password:");
//        gridPane.add(password, 0, 2); // Col 0, Row 2
//
//        PasswordField passwordField = new PasswordField();
//        gridPane.add(passwordField, 1, 2); // Col 1, Row 2
//
//        Button button = new Button("Sign in");
//        HBox hboxButton = new HBox(10);
//        hboxButton.setAlignment(Pos.BOTTOM_RIGHT);
//        hboxButton.getChildren().add(button);
//        gridPane.add(hboxButton, 1, 4);
//
//        Text actionTarget = new Text();
//        gridPane.add(actionTarget, 1, 6);
//
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {
//                actionTarget.setFill(Color.FIREBRICK);
//                actionTarget.setText("Sign in button pressed.");
//            }
//        });
//
//        // Set Scene
//        gridPane.setGridLinesVisible(true);
//        Scene scene = new Scene(gridPane, 400, 250);
//        primaryStage.setScene(scene);
//
//        // Set Stage
//        primaryStage.setTitle("Login");
//        primaryStage.show();
//
//    }

    public static void main(String[] args) {
        launch(args);
    }
}
