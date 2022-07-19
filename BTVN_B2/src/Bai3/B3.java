package Bai3;
import java.util.Scanner;
public class B3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        System.out.print("n = ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
            if(n%i==0)
                sum += i;
        System.out.println("Tong cac uoc cua "+n+" la: "+sum);
    }
}
