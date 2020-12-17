package data;

import java.util.ArrayList;

public class StoppingPointSchedule {
    private ArrayList<Schedule> stoppingPointSchedule;

    public void AddSchedule(Schedule schedule) {
        this.stoppingPointSchedule.add(schedule);
    }

    public ArrayList<Schedule> getRouteSchedule() {
        return this.stoppingPointSchedule;
    }
}
