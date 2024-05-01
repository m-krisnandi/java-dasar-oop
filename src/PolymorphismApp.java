public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Saitama");
        employee.sayHello("Budi");

        employee = new Manager("Natsuo");
        employee.sayHello("Blast");

        employee = new VicePresident("Muhamad Krisnandi");
        employee.sayHello("Silver Fang");

        sayHello(new Employee("Saitama"));
        sayHello(new Manager("Natsuo"));
        sayHello(new VicePresident("Muhamad Krisnandi"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
