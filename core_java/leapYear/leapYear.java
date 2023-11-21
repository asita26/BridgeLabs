import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        int dummyYear = year;
        int count = 0;

        while (dummyYear > 0) {
            count++;
            dummyYear = dummyYear / 10;
        }

        if (count != 4) {
            System.out.println("Enter a valid year");
            return;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Yes, this is a leap year");
                    } else {
                        System.out.println("No, this is not a leap year");
                    }
                } else {
                    System.out.println("Yes, this is a leap year");
                }
            } else {
                System.out.println("No, this is not a leap year");
            }
        }
    }
}

