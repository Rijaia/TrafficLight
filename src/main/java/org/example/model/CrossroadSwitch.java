package org.example.model;

public class CrossroadSwitch extends CrossroadsSynchronize {
    public void switchTrafficLights() throws InterruptedException {
        while (true) {
            /*Машины из первого и третьего потока проезжают*/
            if (trafficLightsForAuto1.getCount()>0||trafficLightsForAuto2.getCount()>0){
                trafficLightsForAuto1.switchToGreen();
                trafficLightsForAuto3.switchToGreen();
                trafficLightsForAuto2.switchToRed();
                trafficLightsForAuto4.switchToRed();
                System.out.println(trafficLightsForAuto1.getCount());
                if (trafficLightsForAuto1.getCount()>0) {
                    trafficLightsForAuto1.setCount(trafficLightsForAuto1.getCount()-1);
                }
                System.out.println(trafficLightsForAuto3.getCount());
                if (trafficLightsForAuto3.getCount() > 0) {
                    trafficLightsForAuto3.setCount(trafficLightsForAuto3.getCount()-1);
                }
            }
            /*Светофоры первого и третьего потока желтые*/
            trafficLightsForAuto1.switchToYellow();
            trafficLightsForAuto3.switchToYellow();
            Thread.sleep(50);

            /*Машины из второго и четвертого потока проезжают*/
            if (trafficLightsForAuto2.getCount()>0||trafficLightsForAuto4.getCount()>0) {
                trafficLightsForAuto2.switchToGreen();
                trafficLightsForAuto4.switchToGreen();
                trafficLightsForAuto1.switchToRed();
                trafficLightsForAuto3.switchToRed();
                System.out.println(trafficLightsForAuto2.getCount());
                if (trafficLightsForAuto2.getCount() > 0) {
                    trafficLightsForAuto2.setCount(trafficLightsForAuto2.getCount()-1);
                }
                System.out.println(trafficLightsForAuto4.getCount());
                if (trafficLightsForAuto4.getCount() > 0) {
                    trafficLightsForAuto4.setCount(trafficLightsForAuto4.getCount()-1);
                }

            }
            /*Светофоры второго и четвертого потока желтые*/
            trafficLightsForAuto2.switchToYellow();
            trafficLightsForAuto4.switchToYellow();
            Thread.sleep(50);
            /*Светофоры для машин красные, для людей зеленые*/
            if (trafficLightsForPeople1.getCount() > 0 ||
                    trafficLightsForPeople2.getCount() > 0 ||
                    trafficLightsForPeople3.getCount() > 0 ||
                    trafficLightsForPeople4.getCount() > 0 ||
                    trafficLightsForPeople5.getCount() > 0 ||
                    trafficLightsForPeople6.getCount() > 0 ||
                    trafficLightsForPeople7.getCount() > 0 ||
                    trafficLightsForPeople8.getCount() > 0) {
                trafficLightsForAuto1.switchToRed();
                trafficLightsForAuto2.switchToRed();
                trafficLightsForAuto3.switchToRed();
                trafficLightsForAuto4.switchToRed();
                trafficLightsForPeople1.switchToGreen();
                trafficLightsForPeople3.switchToGreen();
                trafficLightsForPeople5.switchToGreen();
                trafficLightsForPeople7.switchToGreen();
                print(trafficLightsForPeople1, trafficLightsForPeople2,
                        trafficLightsForPeople3, trafficLightsForPeople4);
                print(trafficLightsForPeople5, trafficLightsForPeople6,
                        trafficLightsForPeople7, trafficLightsForPeople8);
            }


        }
    }

    private void print(TrafficLightsForPeople trafficLightsForPeople1, TrafficLightsForPeople trafficLightsForPeople2, TrafficLightsForPeople trafficLightsForPeople3, TrafficLightsForPeople trafficLightsForPeople4) {
        System.out.println(trafficLightsForPeople1.getCount());
        if (trafficLightsForPeople1.getCount() > 0) {
            trafficLightsForPeople1.setCount(trafficLightsForPeople1.getCount()-1);
        }
        System.out.println(trafficLightsForPeople2.getCount());
        if (trafficLightsForPeople2.getCount() > 0) {
            trafficLightsForPeople2.setCount(trafficLightsForPeople2.getCount()-1);
        }
        System.out.println(trafficLightsForPeople3.getCount());
        if (trafficLightsForPeople3.getCount() > 0) {
            trafficLightsForPeople3.setCount(trafficLightsForPeople3.getCount()-1);
        }
        System.out.println(trafficLightsForPeople4.getCount());
        if (trafficLightsForPeople4.getCount() > 0) {
            trafficLightsForPeople4.setCount(trafficLightsForPeople4.getCount()-1);
        }
    }
}
