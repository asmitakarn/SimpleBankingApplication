/*
 * Simple banking project 
 * Asmita Karn 
 */
/**
 *
 * This class shows the menu to user and call the operation method.
 */
import java.util.Scanner;//needed for scanner class
public class MenuClass { //building menu class

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankOperation bo = new BankOperation();

        System.out.println("Enter customer name:");
        String name = scanner.nextLine();

        System.out.println("Enter customer id:");
        int id = scanner.nextInt();
        
        System.out.println("Enter Account number:");
        int accountNumber= scanner.nextInt();
        
        //do-while loop for printing menu, taking customer inputs and perform the operation. 
        do {
            System.out.println("Enter a number from the menu:");
            System.out.println("1. Check balance.");
            System.out.println("2. Make a deposit.");
            System.out.println("3. Make a withdrawl.");
            System.out.println("4. Calculate interest rate.");
            System.out.println("5. Exit the application.");
            int number = scanner.nextInt();


            switch (number) {
                case 1:

                    System.out.println("Your balance is " + bo.balance);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit.");
                    double amount = scanner.nextInt();
                    bo.deposit(amount);
                    System.out.println("Your deposited amount is " + amount + ".");
                    break;
                case 3:
                    System.out.println("Enter the amount you want to withdrawl.");
                    double amount2 = scanner.nextInt();
                    bo.withdrawl(amount2);
                    System.out.println("Your withdrawl amount is " + amount2 + ".");
                    break;
                case 4:
                    System.out.println("Enter the year you want to calculate simple interest for.");
                    int year= scanner.nextInt();
                    System.out.println("Enter the interest rate you want to calculate simple interest for.");
                    double rate= scanner.nextDouble();
                    System.out.println("Your annual simple interest is " + bo.simpleInterest(year, rate)+ ".");
                    break;
                case 5:
                    System.out.println("Thank you for using our service.");
                    return;
                default:
                    System.out.println("You have entered incorrect number. Please re-enter the number.");

            }

        } while (true);

    }
}