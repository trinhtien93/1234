import java.util.Scanner;

public class InTamGiac {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i; j++) {
                if ((j == i) || (j == 1) || (n == i)) System.out.print(" * ");
                else System.out.print("  ");

            }
            System.out.println("");


        }
    }
}





