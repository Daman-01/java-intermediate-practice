import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        System.out.println();
        String[] nums = new String[5];
        System.out.println("Put the values here");
        Scanner in = new Scanner(System.in);
        nums[0] = in.next();
        nums[1] = in.next();
        nums[2] = in.next();
        nums[3] = in.next();
        nums[4] = in.next();
        System.out.println(Arrays.toString(nums));
    }
}
