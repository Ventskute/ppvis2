package models.interfaces;

import data.Route;

import java.util.List;

public interface RouteBuilder {
    public List<Route> buildRouteByParams();
    public List<Route> divideRoutesByCategories();
    public Route viewDetailedRoute();
    public Route addRouteToFavourites();
}
