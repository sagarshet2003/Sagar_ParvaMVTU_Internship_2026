package exceptionHandling;

import java.util.Scanner;


class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}


class Bank {

    public static void withdraw(int amount) throws InvalidAmountException {
        if(amount > 5000) {
            throw new InvalidAmountException("Withdrawal limit exceeded!");
        } else {
            System.out.println("Withdrawal successful: " + amount);
        }
    }
}

public class customException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        try {
            Bank.withdraw(amount);
        } catch (InvalidAmountException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        sc.close();
    }
}