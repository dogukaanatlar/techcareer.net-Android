import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Faktoriyel faktoriyel = new Faktoriyel();

        System.out.print("Sayıyı giriniz : ");
        int num = scan.nextInt();

        System.out.println("Faktöriyeli : " + faktoriyel.faktoriyelHesap(num));
    }
}