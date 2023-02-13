package seng202;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ToggleGroup routeSelection;
    @FXML
    private RadioButton routeARadioButton;

    @FXML
    private WebView webView;

    private webEngine webEngine;

    private Route routeA = new Route(
            new Position(37.772, -122.214),
            new Position(21.291,  -157.821),
            new Position(-18.142, 178.431),
            new Position(-27.467, 153.027)
    );

    private Route routeB = new Route(
            new Position(-33.946111, 151.177222),
            new Position(-43.489444, 172.532222)
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initMap();

        routeSelection.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == routeARadioButton) {
                displayRoute(routeA);
            } else {
                displayRoute(routeB);
            }
        });
    }

    private void initMap() {
        webEngine = webView.getEngine();
        webEngine.load(Controller.class.getResource("map.html").toExternalForm());
    }

    private void displayRoute(Route newRoute) {
        String scriptToExecute = "displayRoute(" + newRoute.toJSONArray() + ");";
        webEngine.executeScript(scriptToExecute);
    }
}
