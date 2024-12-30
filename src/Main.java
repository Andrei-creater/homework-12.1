public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Іван Петрович Сидоров",
                "Інженер",
                "ivan.sidorov@example.com",
                "+380987654321",
                35
        );

        System.out.println("Інформація про співробітника:");
        employee.displayInfo();

        Car car = new Car();

        System.out.println("\nСпроба запустити машину:");
        car.start();
    }
}
