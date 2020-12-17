package controllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.TransportHelper;
import models.RouteBuilderImpl;

public class BuildRoute extends CommandRoute {
    String commandName = "BuildRoute";

    @FXML
    VBox data;

    @Override
    public void execute() {
        RouteBuilderImpl routeBuilder = TransportHelper.getRouteBuilder();
        ObservableList<Node> childs = data.getChildren();
        routeBuilder.buildRouteByParams(childs);

        Stage modal = new Stage();
        AnchorPane pane = new AnchorPane();
        Label label = new Label("Loading latest schedule..");
        pane.getChildren().add(label);
        AnchorPane.setTopAnchor(label, 70.0);
        AnchorPane.setLeftAnchor(label, 90.0);
        Scene scene = new Scene(pane, 300, 150);

        modal.setScene(scene);
        modal.setTitle("Building routes...");
        modal.showAndWait();
    }

    public String getCommandName() {
        return this.commandName;
    }
}
