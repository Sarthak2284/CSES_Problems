import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder result = new StringBuilder();

            for (int i = 2; i <= n; i += 2) {
                result.append(i).append(" ");
            }

            for (int i = 1; i <= n; i += 2) {
                result.append(i).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }
}
