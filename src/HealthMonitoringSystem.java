interface HealthMonitoringSystem {
    void registerObserver(HealthObserver observer);

    void removeObserver(HealthObserver observer);

    void notifyObservers(String parameter, double value);
}