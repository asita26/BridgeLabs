import java.util.Scanner;

public class largestNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if(num1>num2)
        {
           if(num1>num3) System.out.println("Largest number is third given number"+num3);
           else System.out.println("Largest number is first given number"+num1);
           
        }
        else
        {
         if(num2>num3) System.out.println("Largest number is third given number"+num3);
           else System.out.println("Largest number is second given numbrt"+num2);
        }
    }
}

