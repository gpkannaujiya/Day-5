public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swapping, a = " + a + " and b = " + b);

        // swap the values of a and b
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping, a = " + a + " and b = " + b);
    }
}
