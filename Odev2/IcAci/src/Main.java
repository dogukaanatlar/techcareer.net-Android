import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IcAci icAci = new IcAci();

        System.out.print("Kenar sayısını giriniz : ");
        int num = scan.nextInt();

        System.out.println("İç açısı : " + icAci.aciHesap(num));
    }
}