import java.util.ArrayList;
import java.util.List;

class HealthMonitoringStation implements HealthMonitoringSystem {
    private static HealthMonitoringStation instance;
    private List<HealthObserver> observers = new ArrayList<>();
    private double heartRate;
    private double bodyTemperature;

    private HealthMonitoringStation() {
    }

    public static HealthMonitoringStation getInstance() {
        if (instance == null) {
            instance = new HealthMonitoringStation();
        }
        return instance;
    }

    @Override
    public void registerObserver(HealthObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(HealthObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String parameter, double value) {
        for (HealthObserver observer : observers) {
            observer.update(parameter, value);
        }
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
        notifyObservers("Heart Rate", heartRate);
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
        notifyObservers("Body Temperature", bodyTemperature);
    }

    public double getHeartRate() {
        return heartRate;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }
}