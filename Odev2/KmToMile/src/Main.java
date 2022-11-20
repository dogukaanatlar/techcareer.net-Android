import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KmToMile kmMile = new KmToMile();
        double km;
        Scanner scan = new Scanner(System.in);

        System.out.print("Km giriniz : ");
        km = scan.nextDouble();

        System.out.println(km + " km = " + kmMile.toMile(km) + " Mile");
    }
}