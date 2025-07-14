import java.util.Scanner;

public class WeirdAlgorithm {
    public static void printWeird(long num) {
        while (num != 1) {
            System.out.print(num + " ");
            if (num % 2 != 0) {
                num = (num * 3) + 1;
            } else {
                num = num / 2;
            }
        }
        System.out.print("1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        printWeird(num);
        sc.close();
    }
}
