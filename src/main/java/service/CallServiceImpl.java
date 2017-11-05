package service;

import model.PhoneCall;
import model.TimeEvent;
import repository.CallRepository;
import repository.CallRepositoryImpl;

import java.util.ArrayList;
import java.util.Collections;

public class CallServiceImpl implements CallService{
    CallRepository callRepository = new CallRepositoryImpl();

    //@Override
    public ArrayList<TimeEvent> searchMaxPeriods() {

        int counter = 0;

        ArrayList<TimeEvent> timeEvents = new ArrayList<TimeEvent>();

        for (PhoneCall call : callRepository.listCalls()){
            timeEvents.add(new TimeEvent(call.callStart, true));
            timeEvents.add(new TimeEvent(call.callEnd, false));
        }

        Collections.sort(timeEvents, TimeEvent.timeComparator);

        for (int i = 0; i < timeEvents.size(); i++) {
            if (timeEvents.get(i).isStartTimeEvent()) {
                timeEvents.get(i).setEndTime(timeEvents.get(i + 1).getStartTime());
                timeEvents.get(i).setIntersection(++counter);
            } else {
                timeEvents.get(i).setIntersection(--counter);
            }
//            System.out.println(timeEvents.get(i).getIntersection()+ "-"+timeEvents.get(i).getStartTime()+ ":"
//                    + timeEvents.get(i).getEndTime()+ ":" +timeEvents.get(i).isStartTimeEvent());
        }
        //outputOfResult(timeEvents);
        return timeEvents;
    }

    public void outputOfResult(ArrayList<TimeEvent> timeEvents){
        Collections.sort(timeEvents, TimeEvent.maxPeriodsComparator);

        for (TimeEvent timeEvent : timeEvents){
            if (timeEvent.getIntersection() != timeEvents.get(0).getIntersection()) {
                break;
            } else {
                System.out.println("The peak for this call log is " + timeEvent.getIntersection() + " simultaneous calls," +
                        " that occurred between " + timeEvent.getStartTime() + " and "+ timeEvent.getEndTime());
            }
        }
    }
}

