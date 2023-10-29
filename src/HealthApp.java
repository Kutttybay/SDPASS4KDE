class HealthApp implements HealthObserver {
    private String name;

    public HealthApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String parameter, double value) {
        System.out.println(name + " App: " + parameter + " has changed to " + value);
    }
}