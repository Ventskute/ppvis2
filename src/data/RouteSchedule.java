package data;

import java.util.ArrayList;

public class RouteSchedule {
    private ArrayList<Schedule> routeSchedule;

    public void addSchedule(Schedule schedule){
        this.routeSchedule.add(schedule);
    }

    public ArrayList<Schedule> getRouteSchedule(){
        return this.routeSchedule;
    }
}
