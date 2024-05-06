public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Muhamad Krisnandi";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        // parent.name = "Muhamad Krisnandi";
        parent.doIt();
        System.out.println(parent.name);
    }
}
