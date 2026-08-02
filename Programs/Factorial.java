import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i;
        int factorial=1;
        for (i=1; i <=n; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}

