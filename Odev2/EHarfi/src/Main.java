import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EHarfi eHarfi = new EHarfi();

        System.out.print("Kelimeyi giriniz : ");
        String harf = scan.next();

        eHarfi.eHarfiSay(harf);
    }
}