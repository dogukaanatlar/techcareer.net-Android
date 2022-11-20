public class Faktoriyel {
    public int faktoriyelHesap(int sayi) {
        if (sayi >= 1) {
            return sayi * faktoriyelHesap(sayi - 1);
        } else
            return 1;
    }
}
