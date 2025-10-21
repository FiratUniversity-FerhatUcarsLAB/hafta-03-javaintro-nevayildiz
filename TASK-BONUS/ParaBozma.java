public class ParaBozma {
    public static void main(String[] args) {
        int toplam = 278; // toplam para
        int kalan = toplam;

        int[] banknotlar = {200, 100, 50, 20, 10, 5, 1}; // TL birimleri
        int[] adet = new int[banknotlar.length]; // her bir banknottan kaç tane olduğunu saklar

        // Banknotları hesapla
        for (int i = 0; i < banknotlar.length; i++) {
            adet[i] = kalan / banknotlar[i]; // kaç tane bu banknottan
            kalan = kalan % banknotlar[i];   // kalan para
        }

        // Sonucu yazdır
        System.out.println(toplam + " TL şu şekilde bölünebilir:");
        for (int i = 0; i < banknotlar.length; i++) {
            if (adet[i] > 0) {
                System.out.println(adet[i] + " x " + banknotlar[i] + " TL");
            }
        }
    }
}
