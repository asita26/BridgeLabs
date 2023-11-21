import java.util.*;
public class primeFactors
{
    public static boolean isPrime(int n)
    {
        boolean is_prime=true;
        if(n==0 || n==1) 
            {   is_prime=false;
                return is_prime;
            }
        else
           {
             for(int i=2; i<=n/2;i++)
             {
                if((n % i) == 0)
               {
                 is_prime = false;
                 break;
               } 
             } 
          return is_prime;
        }
   }
      
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i = 2; i<= n; i++){
          if(isPrime(i) == true){
             int a = n;
             while(a%i == 0){
                System.out.println(i);
                a = a/i;
             }
          }
       }

    }  
}




   
