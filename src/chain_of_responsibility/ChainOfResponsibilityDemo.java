package chain_of_responsibility;

import java.util.Scanner;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();

        while(true) {
            int amount;
            System.out.println("Enter a amount of multiple of 100!");

            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if(amount % 100 != 0) {
                System.out.println("Unable to dispense. Amount must be a multiple of 100!");
                continue;
            }

            atm.dispense(new Amount(amount));
        }
    }
}
