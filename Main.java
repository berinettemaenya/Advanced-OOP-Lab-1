public class Main {
    public static void main(String[] args) {
        // Create an instance of Sedan [cite: 21]
        Sedan mySedan = new Sedan();
        mySedan.brand = "Toyota";
        mySedan.speed = 40;

        System.out.println("--- Method Overriding Demo ---");
        // Calls the overridden method in Sedan 
        mySedan.accelerate(); 

        System.out.println("\n--- Method Overloading Demo ---");
        // Calls the overloaded method with an integer 
        mySedan.accelerate(30); 

        System.out.println("\n--- Interface Method Demo ---");
        mySedan.openTrunk();
        
        System.out.println("\nSedan check complete. Ready for GitHub upload!");
    }
}
