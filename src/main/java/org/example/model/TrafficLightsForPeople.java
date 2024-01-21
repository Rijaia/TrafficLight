package org.example.model;

public class TrafficLightsForPeople extends TrafficLights {
    public TrafficLightsForPeople(long id, long count, Condition condition) {
        super(id, count, condition);
    }

    public void switchToGreen() {
        Condition GREEN;
    }
    public void switchToRed() {
        Condition RED;
    }
}
