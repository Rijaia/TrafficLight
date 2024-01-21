package org.example.model;

/*Синхронизация светофоров для безопасности*/
public class CrossroadsSynchronize {
    TrafficLightsForAuto trafficLightsForAuto1 = new TrafficLightsForAuto(1,4,Condition.RED);
    TrafficLightsForAuto trafficLightsForAuto2 = new TrafficLightsForAuto(2,5,Condition.RED);
    TrafficLightsForAuto trafficLightsForAuto3 = new TrafficLightsForAuto(3,6,Condition.RED);
    TrafficLightsForAuto trafficLightsForAuto4 = new TrafficLightsForAuto(4,5,Condition.RED);
    TrafficLightsForPeople trafficLightsForPeople1 = new TrafficLightsForPeople(1,5,Condition.RED);
    TrafficLightsForPeople trafficLightsForPeople2 = new TrafficLightsForPeople(2,3,Condition.RED);
    TrafficLightsForPeople trafficLightsForPeople3 = new TrafficLightsForPeople(3,2,Condition.RED);
    TrafficLightsForPeople trafficLightsForPeople4 = new TrafficLightsForPeople(4,2,Condition.RED);
    TrafficLightsForPeople trafficLightsForPeople5 = new TrafficLightsForPeople(5,5,Condition.RED);
    TrafficLightsForPeople trafficLightsForPeople6 = new TrafficLightsForPeople(6,7,Condition.RED);
    TrafficLightsForPeople trafficLightsForPeople7 = new TrafficLightsForPeople(7,5,Condition.RED);
    TrafficLightsForPeople trafficLightsForPeople8 = new TrafficLightsForPeople(8,4,Condition.RED);

    /*Светофоры для людей должны быть попарно синхронизированы, чтобы не возникало
    * конфликта с разными сигналами у светофоров через одну дорогу*/
    public void synchronizationTrafficLightsForPeople() {
        if (trafficLightsForPeople1.getCondition().equals(Condition.RED)) {
            trafficLightsForPeople2.switchToRed();
        }
        if (trafficLightsForPeople3.getCondition().equals(Condition.RED)) {
            trafficLightsForPeople4.switchToRed();
        }
        if (trafficLightsForPeople5.getCondition().equals(Condition.RED)) {
            trafficLightsForPeople6.switchToRed();
        }
        if (trafficLightsForPeople7.getCondition().equals(Condition.RED)) {
            trafficLightsForPeople8.switchToRed();
        }
        if (trafficLightsForPeople1.getCondition().equals(Condition.GREEN)) {
            trafficLightsForPeople2.switchToGreen();
        }
        if (trafficLightsForPeople3.getCondition().equals(Condition.GREEN)) {
            trafficLightsForPeople4.switchToGreen();
        }
        if (trafficLightsForPeople5.getCondition().equals(Condition.GREEN)) {
            trafficLightsForPeople6.switchToGreen();
        }
        if (trafficLightsForPeople7.getCondition().equals(Condition.GREEN)) {
            trafficLightsForPeople8.switchToGreen();
        }
    }
/*Противоположные светофоры для машин должны быть синхронизированы для свободного проезда
* автомобилей прямо и направо.
* Если схема пересечения перекрестка изменится, этот пункт нужно изменить.
* */
    public void synchronizationTrafficLightsForCar() {
        if (trafficLightsForAuto1.getCondition().equals(Condition.RED)) {
            trafficLightsForAuto3.switchToRed();
        }
        if (trafficLightsForAuto2.getCondition().equals(Condition.RED)) {
            trafficLightsForAuto4.switchToRed();
        }
        if (trafficLightsForAuto1.getCondition().equals(Condition.YEllOW)) {
            trafficLightsForAuto3.switchToYellow();
        }
        if (trafficLightsForAuto2.getCondition().equals(Condition.YEllOW)) {
            trafficLightsForAuto4.switchToYellow();
        }
        if (trafficLightsForAuto1.getCondition().equals(Condition.GREEN)) {
            trafficLightsForAuto3.switchToGreen();
        }
        if (trafficLightsForAuto2.getCondition().equals(Condition.GREEN)) {
            trafficLightsForAuto4.switchToGreen();
        }
    }

    /*Светофоры для людей и машин должны быть синхронизированы для безопасности*/
    public void synchronizationTrafficLightsForCarAndPeople() {
        if (trafficLightsForAuto1.getCondition().equals(Condition.GREEN)||
                trafficLightsForAuto1.getCondition().equals(Condition.YEllOW)) {
            trafficLightsForPeople1.switchToRed();
            trafficLightsForPeople7.switchToRed();
            trafficLightsForPeople3.switchToRed();
        }
        if (trafficLightsForAuto2.getCondition().equals(Condition.GREEN)||
                trafficLightsForAuto2.getCondition().equals(Condition.YEllOW)) {
            trafficLightsForPeople1.switchToRed();
            trafficLightsForPeople3.switchToRed();
            trafficLightsForPeople5.switchToRed();
        }
        if (trafficLightsForAuto3.getCondition().equals(Condition.GREEN)||
                trafficLightsForAuto3.getCondition().equals(Condition.YEllOW)) {
            trafficLightsForPeople3.switchToRed();
            trafficLightsForPeople5.switchToRed();
            trafficLightsForPeople7.switchToRed();
        }
        if (trafficLightsForAuto4.getCondition().equals(Condition.GREEN)||
                trafficLightsForAuto4.getCondition().equals(Condition.YEllOW)) {
            trafficLightsForPeople5.switchToRed();
            trafficLightsForPeople7.switchToRed();
            trafficLightsForPeople1.switchToRed();
        }
        /*Обеспечение безопасного перехода пешеходов*/
        if (trafficLightsForPeople1.getCondition().equals(Condition.GREEN)
        ||trafficLightsForPeople2.getCondition().equals(Condition.GREEN)) {
            trafficLightsForAuto3.switchToRed();
        }
        if (trafficLightsForPeople3.getCondition().equals(Condition.GREEN) ||
                trafficLightsForPeople4.getCondition().equals(Condition.GREEN)) {
            trafficLightsForAuto3.switchToRed();
        }
        if (trafficLightsForPeople5.getCondition().equals(Condition.GREEN) ||
                trafficLightsForPeople6.getCondition().equals(Condition.GREEN)) {
            trafficLightsForAuto4.switchToRed();
        }
        if (trafficLightsForPeople7.getCondition().equals(Condition.GREEN) ||
                trafficLightsForPeople8.getCondition().equals(Condition.GREEN)) {
            trafficLightsForAuto1.switchToRed();
        }

    }
}
