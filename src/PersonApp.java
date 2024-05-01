public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Muhamad Krisnandi", "Bandung");

        // person1.name = "Muhamad Krisnandi";
        // person1.address = "Bandung";

        person1.sayHello("Budi");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();
        person2.name = "Joko";
        person2.sayHello("Budi");
    }
}