package controllers;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CommandSelectRouteForBuilding {
    String commandName = "CommandSelectRouteForBuilding";

    public void execute() {
        Stage modal = new Stage();
        AnchorPane pane = new AnchorPane();
        Label label = new Label("Loading latest schedule..");
        pane.getChildren().add(label);
        Scene scene = new Scene(pane, 300, 150);

        modal.setScene(scene);
        modal.setTitle("Building routes...");
        modal.showAndWait();
    }

    public String getCommandName() {
        return this.commandName;
    }
}
