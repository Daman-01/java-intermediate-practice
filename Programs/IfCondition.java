import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary >= 20_000)
        {
            salary = salary += 5000;
        } else
        {
        salary = salary+10_000;
        }
        System.out.println("The salary with bonus is "+salary);
    }
}
