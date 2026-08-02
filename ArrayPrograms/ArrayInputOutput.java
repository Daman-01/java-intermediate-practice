import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0]=10;
//        arr[1]=11;
//        arr[2]=12;
//        arr[3]=13;
//        arr[4]=14;
//        for (int i = 0; i <arr.length; i++) {
//            arr[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
        String[] str = new String[4];
        for (int i = 0; i <str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}