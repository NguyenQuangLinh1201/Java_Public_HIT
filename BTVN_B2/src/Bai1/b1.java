package Bai1;
import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, y;
        System.out.print("Nhap ngay thang nam sinh: ");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d < 1 || d > 31)
                System.out.println("Ngay khong hop le");
        } else if (m == 2) {
            if (y % 4 == 0) {
                if (d < 1 || d > 29)
                    System.out.println("Ngay khong hop le");
            } else {
                if (d < 1 || d > 28)
                    System.out.println("Ngay khong hop le");
            }
        } else {
            if (d < 1 || d > 30)
                System.out.println("Ngay khong hop le");
        }
        if (m < 1 || m > 12) {
            System.out.println("Thang khong hop le");
        } else {
            if (m == 1) {
                if (d >= 1 && d <= 19)
                    System.out.println("Cung Ma Ket");
                else
                    System.out.println("Cung Bao Binh");
            }
            if (m == 2) {
                if (d >= 1 && d <= 19)
                    System.out.println("Cung Bao Binh");
                else
                    System.out.println("Cung Song Ngu");
            }
            if (m == 3) {
                if (d >= 1 && d <= 20)
                    System.out.println("Cung Song Ngu");
                else
                    System.out.println("Cung Bach Duong");
            }
            if (m == 4) {
                if (d >= 1 && d <= 20)
                    System.out.println("Cung Bach Duong");
                else
                    System.out.println("Cung Kim Nguu");
            }
            if (m == 5) {
                if (d >= 1 && d <= 20)
                    System.out.println("Cung Kim Nguu");
                else
                    System.out.println("Cung Song Tu");
            }
            if (m == 6) {
                if (d >= 1 && d <= 21)
                    System.out.println("Cung Song Tu");
                else
                    System.out.println("Cung Cu Giai");
            }
            if (m == 7) {
                if (d >= 1 && d <= 22)
                    System.out.println("Cung Cu Giai");
                else
                    System.out.println("Cung Su Tu");
            }
            if (m == 8) {
                if (d >= 1 && d <= 22)
                    System.out.println("Cung Su Tu");
                else
                    System.out.println("Cung Xu Nu");
            }
            if (m == 9) {
                if (d >= 1 && d <= 22)
                    System.out.println("Cung Xu Nu");
                else
                    System.out.println("Cung Thien Binh");
            }
            if (m == 10) {
                if (d >= 1 && d <= 23)
                    System.out.println("Cung Thien Binh");
                else
                    System.out.println("Cung Bo Cap");
            }
            if (m == 11) {
                if (d >= 1 && d <= 22)
                    System.out.println("Cung Bo Cap");
                else
                    System.out.println("Cung Nhan Ma");
            }
            if (m == 12) {
                if (d >= 1 && d <= 21)
                    System.out.println("Cung Nhan Ma");
                else
                    System.out.println("Cung Ma Ket");
            }
        }
    }
}

