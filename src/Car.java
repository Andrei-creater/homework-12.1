public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Машина запущена!");
    }
    private void startElectricity() {
        System.out.println("Система електрики активована.");
    }
    private void startCommand() {
        System.out.println("Команда старту передана.");
    }
    private void startFuelSystem() {
        System.out.println("Паливна система активована.");
    }
}
