import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        n = sc.nextInt();
        System.out.println("Please input m:");
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }

        System.out.println("-------------------------------------");

        for (int j = 1; j <= m; j++) {
            if (m % j == 0) {
                System.out.print(" " + j);
            }
        }

        System.out.println("-------------------------------------");


        }


    }








