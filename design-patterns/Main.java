public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance1.associatedValue = 15;
        instance2.associatedValue = 31;

        System.out.println("Instance 1: " + instance1.associatedValue); 
        System.out.println("Instance 2: " + instance2.associatedValue);
        System.out.println("Only one instance existing.");
    }
}
