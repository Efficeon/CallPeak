package service;

import model.TimeEvent;

import java.util.ArrayList;

public interface CallService {
    public ArrayList<TimeEvent> searchMaxPeriods();

    public void outputOfResult(ArrayList<TimeEvent> timeEvents);
}
