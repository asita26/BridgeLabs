import java.util.*;
public class remainderQuotient
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divisor");
        double divisor=sc.nextDouble();
         System.out.println("Enter dividend");
      double dividend=sc.nextDouble();
        double ans1=dividend/divisor;
       double ans2=dividend%divisor;
          System.out.println("Here is the quotient :"+ans1);
           System.out.println("Here is the remainder :"+ans1);
       }
}

