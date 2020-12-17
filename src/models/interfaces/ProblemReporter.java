package models.interfaces;

public interface ProblemReporter {
    public void selectProblemType(String typeProblem);
    public int selectRoadLane(int lane);
    public void reportProblem(String road,String type, String problem, int id);
}
