public class Powerof2 {
        public static void main(String[] args) {
            int numPowers = 10; // change this to generate more or fewer powers of 2
            int power = 1;

            for (int i = 0; i < numPowers; i++) {
                System.out.println("2^" + i + " = " + power);
                power *= 2;
            }
        }
    }


