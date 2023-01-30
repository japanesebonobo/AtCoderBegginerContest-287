package src;
import java.util.*;

public class A_Majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String S[] = new String[N];

        int ans = 0;
        for (int i = 0; i < S.length; i++) {
            S[i] = scanner.next();
            if (S[i].equals("For")) {
                ans ++;
            }
        }
        scanner.close();

        if (ans > N/2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

