package models;

import models.interfaces.ProblemReporter;

public class ProblemReporterImpl implements ProblemReporter {
    String problemType;

    @Override
    public void selectProblemType(String problemType){
        this.problemType = problemType;
    }

    @Override
    public int selectRoadLane(int lane) {
        return lane;
    }

    @Override
    public void reportProblem(String road,String type, String problem, int id){

    }
}
