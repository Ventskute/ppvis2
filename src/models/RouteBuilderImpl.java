package models;

import data.Route;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import models.interfaces.RouteBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class RouteBuilderImpl implements RouteBuilder {
    private ArrayList<Route> favouriteRoutes;

    @Override
    public ArrayList<Route> buildRouteByParams(ObservableList<Node> childs) {
        Route route = new Route();

        route.id = 1;
        route.departureStoppingPoint = ((TextField)childs.get(0)).getText();
        route.arrivalStoppingPoint = ((TextField)childs.get(1)).getText();
        route.departureTime =  new Date().toString();
        route.arrivalTime =  new Date().toString();
        route.transportTypes = (ArrayList<String>)childs
                .subList(4,9)
                .stream().filter(child -> ((CheckBox)child).isSelected())
                .map(child -> ((CheckBox)child).getText()).collect(Collectors.toList());

        ArrayList<Route> routes = new ArrayList<Route>();
        routes.add(route);

        return routes;
    }

    @Override
    public ArrayList<Route> divideRoutesByCategories(List<Route> routes) {
        return (ArrayList<Route>) routes.stream().filter(route -> {
            try {
                return new SimpleDateFormat().parse(route.arrivalTime).getTime() - new SimpleDateFormat().parse(route.departureTime).getTime() > 0;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return false;
        });
    }

    @Override
    public void viewDetailedRoute(Route route) {
        System.out.println(route.id);
        System.out.println(route.arrivalStoppingPoint);
        System.out.println(route.arrivalTime);
        System.out.println(route.departureStoppingPoint);
        System.out.println(route.transportTypes);
    }

    @Override
    public void addRouteToFavourites(Route route) {
        this.favouriteRoutes.add(route);
    }

    public ArrayList<Route> getFavouriteRoutes() {
        return favouriteRoutes;
    };

    public void setFavouriteRoutes(ArrayList<Route> routes) {
        favouriteRoutes = routes;
    };
}
