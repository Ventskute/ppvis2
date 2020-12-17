package UI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class MainView {
    private Stage primaryStage;

    public MainView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Parent showRouteSection() throws IOException {
        Parent routeSection = FXMLLoader.load(getClass().getResource("RouteSection.fxml"));
        return routeSection;
    }
}
