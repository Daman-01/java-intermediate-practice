import java.util.Arrays;
import java.util.Scanner;

public class ArrayMakingByInput {
    public static void main(String[] args) {
        System.out.println("Making a 1d array");
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
//        arr[0] = 95;
//        arr[1] = 21;
//        arr[2] = 55;
//        arr[3] = 39;
//        arr[4] = 45;
        arr[0]= in.nextInt();
        arr[1]= in.nextInt();
        arr[2]= in.nextInt();
        arr[3]= in.nextInt();
        arr[4]= in.nextInt();
        System.out.println(Arrays.toString(arr));
    }
}
