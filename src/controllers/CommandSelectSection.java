package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CommandSelectSection {
    String commandName = "CommandSelectSection";

    @FXML
    AnchorPane body;

    public void execute(ActionEvent actionEvent) throws IOException {
        Button eventTarget = (Button)actionEvent.getSource();
        String sectionName = eventTarget.getText();

        Stage primaryStage = (Stage) eventTarget.getScene().getWindow();

        String section;
        switch(sectionName)
        {
            case "Build a route":
                section = "RouteSection";
                break;
            case "Schedule":
                section = "ScheduleSection";
                break;
            case "Favourite routes":
                section = "FavouritesSection";
                break;
            case "Report a problem":
                section = "ReportSection";
                break;
            default:
                section = "RouteSection";
        }

        FXMLLoader sectionLoader = new FXMLLoader(getClass().getResource("/UI/" + section + ".fxml"));
        primaryStage.setScene(new Scene(sectionLoader.load(), 480, 800));
    }

    public String getCommandName() {
        return this.commandName;
    }
}
