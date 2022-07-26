package Bai2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("BAI 2 \n Nhap chuoi can chuan hoa: ");
        String s = input.nextLine();
        s=s.toLowerCase();
        s=s.strip();
        s=s.replaceAll("\\s+"," ");

        String[] a=s.split(" ");
        s="";
        for(int i=0;i<a.length;i++)
        {
            s+=String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            if(i<a.length-1)
                s+=" ";
        }
        s=s.replaceAll("[1234567890]", "");
        System.out.println(s);
    }
}
