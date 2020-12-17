package models;

import data.RouteSchedule;
import data.Schedule;
import data.StoppingPointSchedule;
import models.interfaces.ScheduleViewer;

import java.util.List;

public class ScheduleViewerImpl implements ScheduleViewer {
    private String scheduleType;

    @Override
    public void selectScheduleType(String type) {
        this.scheduleType = type;
    }

    @Override
    public void viewRoutesList(List<RouteSchedule> routeSchedules) {
        for (RouteSchedule routeSchedule: routeSchedules) {
            for (Schedule schedule: routeSchedule.getRouteSchedule()) {
                System.out.println(schedule.departureTime);
                System.out.println(schedule.arrivalTime);
            }
        }
    }

    @Override
    public void viewStoppingPointsList(List<StoppingPointSchedule> stoppingPointSchedules) {
        for(StoppingPointSchedule stoppingPointSchedule: stoppingPointSchedules){
            for(Schedule schedule: stoppingPointSchedule.getRouteSchedule()){
                System.out.println(schedule.arrivalStoppingPoint);
                System.out.println(schedule.departureStoppingPoints);
                for(String stops: schedule.stops){
                    System.out.println(stops);
                }
            }
        }
    }

    @Override
    public void viewRouteSchedule(RouteSchedule routeSchedule) {
        for(Schedule schedule: routeSchedule.getRouteSchedule()) {
            System.out.println(schedule.departureTime);
            System.out.println(schedule.arrivalTime);
        }
    }

    @Override
    public void viewStoppingPointSchedule(StoppingPointSchedule stoppingPointSchedule) {
        for(Schedule schedule: stoppingPointSchedule.getRouteSchedule()) {
            System.out.println(schedule.arrivalStoppingPoint);
            System.out.println(schedule.departureStoppingPoints);
            for(String stops: schedule.stops) {
                System.out.println(stops);
            }
        }
    }
}
