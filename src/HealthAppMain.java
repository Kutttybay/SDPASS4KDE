public class HealthAppMain {
    public static void main(String[] args) {
        HealthMonitoringStation healthStation = HealthMonitoringStation.getInstance();

        HealthObserverFactory appFactory = new HealthAppFactory();

        HealthObserver healthApp1 = appFactory.createHealthObserver("App1");
        HealthObserver healthApp2 = appFactory.createHealthObserver("App2");

        healthStation.registerObserver(healthApp1);
        healthStation.registerObserver(healthApp2);

        // Simulate changes in health parameters
        healthStation.setHeartRate(75.5);
        healthStation.setBodyTemperature(98.6);

        // Access health parameters
        System.out.println("Current Heart Rate: " + healthStation.getHeartRate());
        System.out.println("Current Body Temperature: " + healthStation.getBodyTemperature());
    }
}