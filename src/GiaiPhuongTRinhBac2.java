//import java.util.Scanner;
//
//public class GiaiPhuongTRinhBac2 {
//    public static void main(String[] args) {
//        int a, b, c;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input a:");
//        a = sc.nextInt();
//        System.out.println("Please input b:");
//        b = sc.nextInt();
//        System.out.println("Please input c:");
//        c = sc.nextInt();
//        if (a == 0) {
//            if (b == 0 && c == 0) {
//                System.out.println("Phuong trinh co vo so nghiem:");
//            } else {
//                float x = (float) -c / b;
//                System.out.println("Phuong trinh co nghiem :" + x);
//            }
//
//        } else {
//            double x1, x2;
//            int delta = b * b - 4 * a * c;
//            if (delta == 0) {
//                System.out.println("Phuong trinh co nghiem kep:x=" + -b / 2 * a);
//
//
//            } else if (delta < 0) {
//                System.out.println("Phuong trinh vo nghiem:");
//
//            } else {
//                System.out.println("Phuong trinh co 2 nghiem phan biet:");
//                x1 = -b + Math.sqrt(delta) / (2 * a);
//                x2 = -b - Math.sqrt(delta) / (2 * a);
//            }
//
//        }
//    }
//}
//
//
//
