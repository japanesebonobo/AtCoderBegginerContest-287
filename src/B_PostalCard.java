package src;
import java.util.*;

public class B_PostalCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        String S[] = new String[N];
        for (int i = 0; i < S.length; i++) {
            S[i] = scanner.next();
        }

        Set<String> tSet = new HashSet<>();
        for (int i = 0; i < M; i++) {
            String T = scanner.next();
            tSet.add(T);
        }
        scanner.close();
        
        int ans = 0;
        for (int i = 0; i < S.length; i++) {
            char s[] = S[i].toCharArray();
            for (Iterator<String> iterator = tSet.iterator(); iterator.hasNext(); ) {
                char t[] = iterator.next().toCharArray();
                if (s[3] == t[0] && s[4] == t[1] && s[5] == t[2]) {
                    ans++;
                    continue;
                }
            }
        }

        System.out.println(ans);
    }
}

