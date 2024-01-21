package org.example.model;

public class TrafficLightsForAuto extends TrafficLights{

    public TrafficLightsForAuto(long id, long count, Condition condition) {
        super(id, count, condition);
    }

    public void switchToGreen() {
        Condition GREEN;
    }

    public void switchToYellow() {
        Condition YELLOW;
    }

    public void switchToRed() {
        Condition RED;
    }
}
