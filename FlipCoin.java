import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int numFlips = 10; // Set the number of flips to 10
        int numHeads = 0;
        int numTails = 0;
        Random rand = new Random();
        for (int i = 0; i < numFlips; i++) {
            if (rand.nextDouble() < 0.5) {
                numHeads++;
            } else {
                numTails++;
            }
        }
        double headPercent = ((double)numHeads / numFlips) * 100;
        double tailPercent = ((double)numTails / numFlips) * 100;
        System.out.println("Heads: " + headPercent + "%");
        System.out.println("Tails: " + tailPercent + "%");
    }
}
