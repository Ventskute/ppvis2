package models.interfaces;

import data.RouteSchedule;
import data.StoppingPointSchedule;

import java.util.List;

public interface ScheduleViewer {
    public void selectScheduleType();
    public void viewRoutesList(List<RouteSchedule> routeSchedule);
    public void viewStoppingPointsList(List<StoppingPointSchedule> stoppingPointSchedule);
    public void viewRouteSchedule(RouteSchedule routeSchedule);
    public void viewStoppingPointSchedule(StoppingPointSchedule stoppingPointSchedule);
}
