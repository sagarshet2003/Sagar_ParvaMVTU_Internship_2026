package com.problems_loops_functions;

import java.util.Scanner;

public class Loops_practise_30_question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Java loop functions practise ");
		
		System.out.println("1 print numbers 1 to n");
        System.out.println("2. print numbers n to 1");
        System.out.println("3. print even numbers");
        System.out.println("4. print odd numbers");
        System.out.println("5. sum of first N numbers");
        System.out.println("6. factorial of a number");
        System.out.println("7. multiplication table");
        System.out.println("8. sum of even numbers");
        System.out.println("9. sum of odd numbers");
        System.out.println("10. reverse a number");
        System.out.println("11. count digits");
        System.out.println("12. sum of digits");
        System.out.println("13. product of digits");
        System.out.println("14. palindrome number");
        System.out.println("15. prime number");
        System.out.println("16. fibonacci series");
        System.out.println("17. armstrong number");
        System.out.println("18. strong number");
        System.out.println("19. largest digit");
        System.out.println("20. smallest digit");
        System.out.println("21. count even digits");
        System.out.println("22. count odd digits");
        System.out.println("23. perfect number");
        System.out.println("24. numbers divisible by 3");
        System.out.println("25. numbers divisible by 5");
        System.out.println("26. square of numbers");
        System.out.println("27. cube of numbers");
        System.out.println("28. star triangle pattern");
        System.out.println("29. reverse star pattern");
        System.out.println("30. power of a number");
        
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        
        switch(choice) {
        
        case 1:
        	System.out.println("print numbers 1 to n");
        	System.out.println("Enter number");
        	int n = sc.nextInt();
        	for(int i=1;i<=n;i++)
        	    System.out.println(i);
        	    break;
        	    
        case 2:
        	System.out.println("print numers n to 1");
        	System.out.println("Enter number");
        	n = sc.nextInt();
            for(int i=n;i>=1;i--)
                System.out.println(i);
            break;
            
            case 3:
            	System.out.println("print even numbers");
                System.out.print("Enter N: ");
                n = sc.nextInt();
                for(int i=1;i<=n;i++)
                    if(i%2==0)
                        System.out.println(i);
                break;

            case 4:
            	System.out.println("print odd numbers");
                System.out.print("Enter N: ");
                n = sc.nextInt();
                for(int i=1;i<=n;i++)
                    if(i%2!=0)
                        System.out.println(i);
                break;

            case 5:
            	System.out.println("sum of first N numbers");
                System.out.print("Enter N: ");
                n = sc.nextInt();
                int sum=0;
                for(int i=1;i<=n;i++)
                    sum+=i;
                System.out.println("Sum = "+sum);
                break;

            case 6:
            	System.out.println("factorial of a number");
                System.out.print("Enter number: ");
                n = sc.nextInt();
                int fact=1;
                for(int i=1;i<=n;i++)
                    fact*=i;
                System.out.println("Factorial = "+fact);
                break;

            case 7:
            	System.out.println(" multiplication table");
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                for(int i=1;i<=10;i++)
                    System.out.println(num+" x "+i+" = "+(num*i));
                break;

            case 8:
            	 System.out.println(" sum of even numbers");
                System.out.print("Enter N: ");
                n = sc.nextInt();
                sum=0;
                for(int i=1;i<=n;i++)
                    if(i%2==0)
                        sum+=i;
                System.out.println("Sum of Even = "+sum);
                break;

            case 9:
            	System.out.println("sum of odd numbers");
                System.out.print("Enter N: ");
                n = sc.nextInt();
                sum=0;
                for(int i=1;i<=n;i++)
                    if(i%2!=0)
                        sum+=i;
                System.out.println("Sum of Odd = "+sum);
                break;

            case 10:
            	System.out.println("reverse a number");
                System.out.print("Enter number: ");
                num = sc.nextInt();
                int rev=0;
                while(num>0){
                    rev=rev*10+num%10;
                    num/=10;
                }
                System.out.println("Reverse = "+rev);
                break;

            case 11:
            	System.out.println(" count digits");
                System.out.print("Enter number: ");
                num = sc.nextInt();
               int count=0;
                while(num>0){
                    num/=10;
                    count++;
                }
                System.out.println("Digits = "+count);
                break;

            case 12:
            	System.out.println("sum of digits");
                System.out.print("Enter number: ");
                num = sc.nextInt();
                sum=0;
                while(num>0){
                    sum+=num%10;
                    num/=10;
                }
                System.out.println("Sum of digits = "+sum);
                break;

            case 13:
            	System.out.println("product of digits:");
                System.out.print("Enter number: ");
                num = sc.nextInt();
               int product=1;
                while(num>0){
                    product*=num%10;
                    num/=10;
                }
                System.out.println("Product = "+product);
                break;   
       
                case 14:
                	System.out.println("palindrome number:");
                    System.out.print("Enter number: ");
                    num = sc.nextInt();
                    int original=num;
                    rev=0;
                    while(num>0){
                        rev=rev*10+num%10;
                        num/=10;
                    }
                    if(original==rev)
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 15:
                	System.out.println("Prime number:");
                    System.out.print("Enter number: ");
                    num = sc.nextInt();
                    boolean prime=true;
                    for(int i=2;i<=num/2;i++){
                        if(num%i==0){
                            prime=false;
                            break;
                        }
                    }
                    if(prime)
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not Prime");
                    break;

                case 16:
                	System.out.println("fibonacci series:");
                    System.out.print("Enter terms: ");
                    n = sc.nextInt();
                    int a=0,b=1;
                    for(int i=1;i<=n;i++){
                        System.out.print(a+" ");
                        int c=a+b;
                        a=b;
                        b=c;
                    }
                    break;
                    
                    case 17:
                    	System.out.println("armstrong number");
                        System.out.print("Enter number: ");
                        num = sc.nextInt();
                        sum=0;
                        int temp=num;
                        while(temp>0){
                            int d=temp%10;
                            sum+=d*d*d;
                            temp/=10;
                        }
                        if(sum==num)
                            System.out.println("Armstrong Number");
                        else
                            System.out.println("Not Armstrong");
                        break;

                    case 18:
                    	System.out.println("strong number");
                        System.out.print("Enter number: ");
                        num = sc.nextInt();
                        sum=0;
                        temp=num;
                        while(temp>0){
                            int d=temp%10;
                            int f=1;
                            for(int i=1;i<=d;i++)
                                f*=i;
                            sum+=f;
                            temp/=10;
                        }
                        if(sum==num)
                            System.out.println("Strong Number");
                        else
                            System.out.println("Not Strong");
                        break;

                    case 19:
                    	System.out.println("largest digit:");
                        System.out.print("Enter number: ");
                        num = sc.nextInt();
                        int max=0;
                        while(num>0){
                            int d=num%10;
                            if(d>max)
                                max=d;
                            num/=10;
                        }
                        System.out.println("Largest digit = "+max);
                        break;

                    case 20:
                    	System.out.println("smallest digits:");
                        System.out.print("Enter number: ");
                        num = sc.nextInt();
                       int min=9;
                        while(num>0){
                            int d=num%10;
                            if(d<min)
                                min=d;
                            num/=10;
                        }
                        System.out.println("Smallest digit = "+min);
                        break;

                    case 21:
                    	System.out.println("count even digits:");
                        System.out.print("Enter number: ");
                        num = sc.nextInt();
                        count=0;
                        while(num>0){
                            int d=num%10;
                            if(d%2==0)
                                count++;
                            num/=10;
                        }
                        System.out.println("Even digits = "+count);
                        break;

                    case 22:
                    	System.out.println("count odd digits:");
                        System.out.print("Enter number: ");
                        num = sc.nextInt();
                        count=0;
                        while(num>0){
                            int d=num%10;
                            if(d%2!=0)
                                count++;
                            num/=10;
                        }
                        System.out.println("Odd digits = "+count);
                        break;

                    case 23:
                    	System.out.println("perfect number");
                        System.out.print("Enter number: ");
                        num = sc.nextInt();
                        sum=0;
                        for(int i=1;i<num;i++)
                            if(num%i==0)
                                sum+=i;
                        if(sum==num)
                            System.out.println("Perfect Number");
                        else
                            System.out.println("Not Perfect");
                        break;

                    case 24:
                    	System.out.println("print numbers div by 3:");
                        System.out.print("Enter N: ");
                        n = sc.nextInt();
                        for(int i=1;i<=n;i++)
                            if(i%3==0)
                                System.out.println(i);
                        break;

                    case 25:
                    	System.out.println("print numbers div by 5");
                        System.out.print("Enter N: ");
                        n = sc.nextInt();
                        for(int i=1;i<=n;i++)
                            if(i%5==0)
                                System.out.println(i);
                        break;

                    case 26:
                    	System.out.println("print square num");
                        System.out.print("Enter N: ");
                        n = sc.nextInt();
                        for(int i=1;i<=n;i++)
                            System.out.println(i*i);
                        break;

                    case 27:
                    	System.out.println("print qube numbers:");
                        System.out.print("Enter N: ");
                        n = sc.nextInt();
                        for(int i=1;i<=n;i++)
                            System.out.println(i*i*i);
                        break;

                    case 28:
                    	System.out.println("star triangle pattern");
                        for(int i=1;i<=5;i++){
                            for(int j=1;j<=i;j++)
                                System.out.print("* ");
                            System.out.println();
                        }
                        break;

                    case 29:
                    	System.out.println("reverse star pattern");
                        for(int i=5;i>=1;i--){
                            for(int j=1;j<=i;j++)
                                System.out.print("* ");
                            System.out.println();
                        }
                        break;

                    case 30:
                    	System.out.println("power of number:");
                        System.out.print("Enter base: ");
                        int base=sc.nextInt();
                        System.out.print("Enter power: ");
                        int power=sc.nextInt();
                        int result=1;
                        for(int i=1;i<=power;i++)
                            result*=base;
                        System.out.println("Result = "+result);
                        break;

                    default:
                        System.out.println("Invalid choice");   
        	
        }
	}
}
