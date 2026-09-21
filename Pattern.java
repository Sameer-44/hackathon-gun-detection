import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pat10(n);
        sc.close();
    }

    static void Pat10(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char)('E' - i);   // starting letter decreases each row

            // leading spaces (optional if you want a centered look)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print the letter i+1 times
            for (int k = 0; k <= i; k++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
