import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuecode = true;
        while (continuecode){
            System.out.println("1 : celsius to fahrenheit");
            System.out.println("2 : fahrenheit to celsius");
            System.out.println("3 : EXIT");
            System.out.println("Choose an option from above (1 or 2)");

            int c;
            int f;
            int choice = scanner.nextInt();
            System.out.println("you choose the option " + choice);
            if (choice == 1) {
                c = scanner.nextInt();
                f = (c * 9 / 5) + 32;
                System.out.println(c + " celsius is " + f + " fahrenheit");
            } else if (choice == 2) {
                f = scanner.nextInt();
                c = (f - 32) * 5 / 9;
                System.out.println(f + " fahrenheit is " + c + " celsius");
            } else if (choice == 3) {
                continuecode= false;
                System.out.println("EXITING");
            } else {
                System.out.println("invalid option please chose from 1 and 2");
            }
        }
    }
}
