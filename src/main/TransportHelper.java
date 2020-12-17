package main;

import UI.MainView;
import controllers.*;
import data.Route;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.FavouritesViewerImpl;
import models.ProblemReporterImpl;
import models.RouteBuilderImpl;
import models.ScheduleViewerImpl;

import java.io.IOException;
import java.util.List;

public class TransportHelper extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Transport Helper");

        BuildRoute buildRoute = new BuildRoute();
        CommandSelectRouteForBuilding commandSelectRoute = new CommandSelectRouteForBuilding();
        CommandSelectSection commandSelectSection = new CommandSelectSection();
        MarkFavourite markFavourite = new MarkFavourite();
        ShowMap showMap = new ShowMap();
        ShowMenu showMenu = new ShowMenu();
        ShowRouteSchedule showRouteSchedule = new ShowRouteSchedule();
        ShowStoppingPointSchedule showStoppingPointSchedule = new ShowStoppingPointSchedule();
        SubmitReportedProblem submitReportedProblem = new SubmitReportedProblem();

        RouteBuilderImpl routeBuilder = new RouteBuilderImpl();
        ScheduleViewerImpl scheduleViewer = new ScheduleViewerImpl();
        ProblemReporterImpl problemReporter = new ProblemReporterImpl();
        FavouritesViewerImpl favouritesViewer = new FavouritesViewerImpl();

        MainView mainView = new MainView(primaryStage);

        Parent root = mainView.showRouteSection();
        Scene scene = new Scene(root, 480, 800);
        primaryStage.setScene(scene);

        scene.getStylesheets().add(getClass().getResource("/UI/main.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
