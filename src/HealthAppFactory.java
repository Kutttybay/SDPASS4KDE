class HealthAppFactory implements HealthObserverFactory {
    @Override
    public HealthObserver createHealthObserver(String name) {
        return new HealthApp(name);
    }
}