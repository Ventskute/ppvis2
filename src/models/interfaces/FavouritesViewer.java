package models.interfaces;

import data.Route;
import models.RouteBuilderImpl;

import java.util.ArrayList;
import java.util.List;

public interface FavouritesViewer {
    public ArrayList<Route> showFavouriteRoutes(RouteBuilderImpl routeBuilder);
    public void unmarkFavourite(Route route, RouteBuilderImpl routeBuilder);
    public void viewDetailedRoute(Route route);
    public void selectRouteForBuilding(Route route);
}
