import java.util.*;

public class harmonicValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose harmonic value you want to obtain");
        int N=sc.nextInt();
        if(N<=0)
        {
               System.out.println("Invalid Input");
               return;
        }
      double res=0;
     double count=1.0;
        for(int i=0; i<N; i++)
        {
         double fractionalVal=1/count;
         res=res+fractionalVal;
count++;
     }
     System.out.println(res);
 }
}
