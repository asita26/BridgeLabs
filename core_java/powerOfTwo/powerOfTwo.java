import java.util.*;

public class powerOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power value");
        int N = sc.nextInt();
        if(N<0 || N>=31)
        {
            System.out.println("Invalid input, please provide input again");
             return;
        }
         double result = Math.pow(2, N);
         int res=2;
      System.out.println("Here are all the powers of 2 that are less than or equal to"+result);   
while(res<=result)
         {
            System.out.println(res);
       res=res*2;
  }

    }
}
