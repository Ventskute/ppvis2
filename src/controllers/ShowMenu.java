package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowMenu {
    String commandName = "ShowMenu";

    @FXML
    Button menuButton;

    @FXML
    public void execute() throws IOException {
        Stage primaryStage = (Stage) menuButton.getScene().getWindow();

        FXMLLoader routeSection = new FXMLLoader(getClass().getResource("/UI/Menu.fxml"));
//        primaryStage.setScene(new Scene(routeSection.load(), 480, 800));
        primaryStage.getScene().setRoot(routeSection.load());
    }

    public String getCommandName() {
        return this.commandName;
    }
}
