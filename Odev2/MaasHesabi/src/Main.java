import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MaasHesap maasHesap = new MaasHesap();

        System.out.print("Gün sayısını giriniz : ");
        int num = scan.nextInt();

        System.out.println("Maaşınız : " + maasHesap.maasHesapla(num));
    }
}