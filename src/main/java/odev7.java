import java.sql.SQLOutput;
import java.util.Scanner;
//vücut kitle indeksi bulmak 
public class odev7 {
    public static void main(String[] args) {
        double k, b;

        Scanner boy=new Scanner(System.in);
        System.out.print(" lütfen boyunuzu metre cinsinden ondalık olarak giriniz: ");
        b=boy.nextDouble();
        Scanner kilo=new Scanner(System.in);
        System.out.print(" lütfen kilonuzu kg cinsinden ondalık olarak giriniz: ");
        k=kilo.nextDouble();

        double vucutKitleIndex=k/(b*b);
        System.out.print("vücut kitle indeksiniz:" + vucutKitleIndex);


    }
}
