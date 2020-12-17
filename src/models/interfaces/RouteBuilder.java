package models.interfaces;

import data.Route;
import javafx.collections.ObservableList;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

public interface RouteBuilder {
    public ArrayList<Route> buildRouteByParams(ObservableList<Node> childs);
    public ArrayList<Route> divideRoutesByCategories(List<Route> routes);
    public void viewDetailedRoute(Route route);
    public void addRouteToFavourites(Route route);
}
