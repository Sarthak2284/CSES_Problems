import java.util.*;

public class MissingNumber {
    public static long missingNumber(long[] arr) {
        long n = arr.length + 1;
        long nSum = n * (n + 1) / 2;
        long arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return nSum - arrSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long[] arr = new long[(int)n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
        sc.close();
    }
}
