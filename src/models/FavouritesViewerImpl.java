package models;

import data.Route;
import models.interfaces.FavouritesViewer;

import java.util.ArrayList;
import java.util.List;

public class FavouritesViewerImpl implements FavouritesViewer {

    @Override
    public ArrayList<Route> showFavouriteRoutes(RouteBuilderImpl routeBuilder) {
        for (Route r : routeBuilder.getFavouriteRoutes()) {
            System.out.println(r.id);
            System.out.println(r.transportTypes);
            System.out.println(r.departureStoppingPoint);
            System.out.println(r.arrivalStoppingPoint);
            for (String stops : r.stops) {
                System.out.println(stops);
            }
        }
        return routeBuilder.getFavouriteRoutes();
    }

    @Override
    public void unmarkFavourite(Route route, RouteBuilderImpl routeBuilder) {
        ArrayList<Route> favs = routeBuilder.getFavouriteRoutes();
        favs.remove(route);
        routeBuilder.setFavouriteRoutes(favs);
    }

    @Override
    public void viewDetailedRoute(Route route) {
        System.out.println(route.id);
        System.out.println(route.transportTypes);
        System.out.println(route.departureStoppingPoint);
        System.out.println(route.arrivalStoppingPoint);
        for (String stops : route.stops) {
            System.out.println(stops);
        }
    }

    @Override
    public void selectRouteForBuilding(Route route) {

    }
}
