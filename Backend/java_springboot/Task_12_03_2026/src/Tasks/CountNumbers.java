package Tasks;

import java.util.Scanner;

public class CountNumbers {

    public static int countDigits(int num) {
        int count = 0;

        while(num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Number of digits: " + countDigits(num));
    }
}