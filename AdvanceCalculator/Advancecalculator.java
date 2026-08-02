import java.util.Scanner;

public class AdvanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.add");
        System.out.println("2.sub");
        System.out.println("3.divide");
        System.out.println("4.multiply");

        System.out.println("enter your input");
        int input = scanner.nextInt();
        System.out.println("your input : " + input);
        System.out.println("Now enter your 1st no ");

        int num1 = scanner.nextInt();
        System.out.println("You entered no : "+num1);

        System.out.println("Now enter your 2nd no");
        int num2 = scanner.nextInt();
        System.out.println("You entered no : "+num2);

        int add = num1 + num2;
        int sub = num1 - num2;
        int divide = num1 / num2;
        int multiply = num1 * num2;

        switch (input) {
            case 1 -> System.out.println("the add of the numbers = " + add);
            case 2 -> System.out.println("the subtraction of the no = " + sub);
            case 3 -> System.out.println("the divide of the no is = " + divide);
            case 4 -> System.out.println("the multiply of the no's is " + multiply);
        }
        scanner.close();
    }

}
