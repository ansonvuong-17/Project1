import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        double CompactWeekdays = 25.99;
        double CompactWeekends = 32.99;
        double MidsizeWeekdays = 38.99;
        double MidsizeWeekends = 52.99;
        double SedanWeekdays = 42.99;
        double SedanWeekends = 65.99;
        
        Scanner input = new Scanner(System.in);
        boolean anotherRental = true;
        
        System.out.println("Welcome to the Car Rental Calculator");
        
        while (anotherRental) {
            System.out.println("Enter First Name: ");
            String firstName = input.next();
            System.out.println("Enter Last Name: ");
            String lastName = input.next();
            System.out.println("Enter car type (C for compact, M for midsize, S for sedan): ");
            String carType = input.next();
            
            System.out.println("Enter number of weekdays rented: ");
            int weekdays = input.nextInt();
            
            System.out.println("Enter number of weekends rented: ");
            int weekends = input.nextInt();
            
            double totalCost = 0;
            double nationalAverage = 55.00; 
            
            if (carType.equalsIgnoreCase("C")) {
                totalCost = CompactWeekdays * weekdays + CompactWeekends * weekends;
            } else if (carType.equalsIgnoreCase("M")) {
                totalCost = MidsizeWeekdays * weekdays + MidsizeWeekends * weekends;
            } else if (carType.equalsIgnoreCase("S")) {
                totalCost = SedanWeekdays * weekdays + SedanWeekends * weekends;
            } else {
                System.out.println("Invalid car type entered.");
            }
            

            System.out.println("Total rental cost: $" + totalCost);

            if (totalCost >= nationalAverage + 5.0) {
                System.out.println("The rental is expensive.");
            } else if (totalCost <= nationalAverage - 5.0) {
                System.out.println("The rental is a bargain.");
            } else {
                System.out.println("The rental is average.");
            }
            

            System.out.println("Do you want another rental? (Y/N)");
            String answer = input.next();
            
            if (answer.equalsIgnoreCase("Y")) {
                anotherRental = true;
            } else {
                anotherRental = false;
            }
        }
        input.close();
        System.out.println("Thank you for using the Car Rental Calculator.");
    }
}
