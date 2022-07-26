package Bai1;
import java.util.Scanner;
public class bai1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int []a;
        int n;
        System.out.print("n = ");
        n = sc.nextInt();
        a = new int[n];
        input(a,n);
        System.out.println("Trung binh cong cac so le o vi tri chan = " + TBC(a));
        viTriCacSoMin(a);
        checkSCP(a);
        int dem =0;
        for(int i=0;i<n;i++)
            if(checkSNT(a[i]))
                dem++;
        if(dem==0)
            System.out.println("KHong co SNT nao trong mang");
        else{
            System.out.print("Cac so nguyen to co trong mang la: ");
            for(int i=0;i<n;i++)
                if(checkSNT(a[i]))
                    System.out.print(a[i]+" ");
            System.out.println();
        }
        sx(a);
        System.out.println("Mang sau khi da sap xep tang dan:");
        for (int i:
             a) {
            System.out.print(i+" ");
        }
    }

    public static void input(int[] a,int n) {
        for(int i=0;i<n;i++){
            System.out.printf("a[%d] = ",i);
            a[i] = sc.nextInt();
        }
    }

    public static float TBC(int[] a){
        float s=0;
        int d=0;
        for(int i=0;i< a.length;i++)
            if(i%2!=0)
                if(a[i]%2!=0){
                    s+=a[i];
                    d++;
                }
        return s/d;
    }

    public static int min(int[] a) {
        int min = a[0];
        for(int i=1;i<a.length;i++)
            if(a[i]<min)
                min = a[i];
        return min;
    }

    public static void viTriCacSoMin(int[] a){
        System.out.print("Vi tri cac so nho nhat trong mang la: ");
        for(int i=0;i<a.length;i++)
            if(a[i]==min(a))
                System.out.print((i+1) + " ");
        System.out.println();
    }

    public static void checkSCP(int[] a){
        int p,d=0;
        float q;
        System.out.print("Kiem tra so chinh phuong trong mang: ");
        for(int i=0;i<a.length;i++) {
            p = (int) Math.sqrt(a[i]);
            q = (float) Math.sqrt(a[i]);
            if (p == q) {
                System.out.print(a[i] + " ");
                d++;
            }
        }
        System.out.println();
        if(d==0) System.out.println("khong co so chinh phuong nao trong mang");
    }
    public static boolean checkSNT(int n){
        if(n<2) return false;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void sx(int[] a) {
        for(int i=0;i<a.length-1;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i]>a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
    }
}
