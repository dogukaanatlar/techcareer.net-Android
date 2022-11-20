public class Otopark {
    public int ucretHesapla(int sure) {
        if (sure > 1) {
            return ((sure - 1) * 10) + 50;
        } else {
            return sure * 50;
        }
    }
}
