public class MaasHesap {
    public int maasHesapla(int gun) {
        int saat = gun * 8;
        int mesai, maas;

        if (saat > 150) {
            maas = 150 * 40;
            mesai = (saat - 150) * 80;

            return maas + mesai;
        } else {
            return saat * 40;
        }
    }
}
