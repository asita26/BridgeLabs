import java.util.Scanner;
import java.util.Random;

public class flipCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        
        int numFlips = scanner.nextInt();
    
        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

       
        int hdCount = 0, tlCount = 0;
        Random random = new Random();

        for (int i = 0; i < numFlips; i++) {
            double randomVal = random.nextDouble();
            if (randomVal < 0.5) {
                hdCount++;
            } else {
                tlCount++;
            }
        }

        double percentageHeads = (hdCount * 100.0) / numFlips;
        double percentageTails = (tlCount * 100.0) / numFlips;

        System.out.println("Percentage of Heads: " + percentageHeads + "%");
        System.out.println("Percentage of Tails: " + percentageTails + "%");
    }
}

