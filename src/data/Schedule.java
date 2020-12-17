package data;

import java.util.ArrayList;

public abstract class Schedule {
    public Integer id;
    public String departureStoppingPoints;
    public String arrivalStoppingPoint;
    public String departureTime;
    public String arrivalTime;
    public ArrayList<String> transportTypes;
    public ArrayList<String> stops;
}
