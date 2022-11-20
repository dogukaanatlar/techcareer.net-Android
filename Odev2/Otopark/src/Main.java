import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Otopark otopark = new Otopark();

        System.out.print("Süreyi giriniz : ");
        int num = scan.nextInt();

        System.out.println("Otopark ücretiniz : " + otopark.ucretHesapla(num));
    }
}