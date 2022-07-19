package Bai2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap do dai 3 canh: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
                if((a==b && a!=c) || (a==c && a!=b) || (c==b && a!=c))
                    System.out.println("3 canh vua nhap la do dai tam giac vuong can");
                else
                    System.out.println("3 canh vua nhap la do dai tam giac vuong");
            }
            else if((a==b && a!=c) || (a==c && a!=b) || (c==b && a!=c))
                System.out.println("3 canh vua nhap la do dai tam giac can");
            else if(a==b && a==c)
                System.out.println("3 canh vua nhap la do dai tam giac deu");
            else
                System.out.println("3 canh vua nhap la do dai tam giac thuong");
        }
    }
}
