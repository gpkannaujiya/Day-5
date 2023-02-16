import java.util.Scanner;
public class LeapYear {


    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " Year is leap Year");
        } else {
            System.out.println(year + " Year is not leap year");
        }
    }
}