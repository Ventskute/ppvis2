package models.interfaces;

import data.Route;

import java.util.List;

public interface FavouritesViewer {
    public List<Route> showFavouriteRoutes();
    public void unmarkFavourite(Route route);
    public void viewDetailedRoute(Route route);
    public void selectRouteForBuilding(Route route);
}
