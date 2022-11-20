public class EHarfi {
    public void eHarfiSay(String word) {
        int kelime = word.length();
        int count = 0;

        for (int i = 0; i < kelime; i++) {
            if (word.charAt(i) == 'e') {
                count++;
            }
        }

        System.out.println(count + " Adet e vardır.");
    }
}
