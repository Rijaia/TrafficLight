package org.example.model;

public class TrafficLights {
    long id;
    long count;
    Condition condition;

    public TrafficLights(long id, long count, Condition condition) {
        this.id = id;
        this.count = count;
        this.condition = condition;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "TrafficLights{" +
                "id=" + id +
                ", count=" + count +
                ", condition=" + condition +
                '}';
    }
}
