public class HesapOzeti {
    public static void main(String[] args) {
        String[] urunler = {"Süt", "Ekmek", "Elma", "Peynir", "Yumurta"};
        int[] miktarlar = {2, 1, 6, 1, 12};
        double[] fiyatlar = {8.50, 3.25, 1.20, 28.40, 0.75};

        System.out.println("+-----------------+----------+-------------+-------------+");
        System.out.printf("| %-15s | %8s | %11s | %11s |\n", "Ürün", "Miktar", "Fiyat (₺)", "Toplam (₺)");
        System.out.println("+-----------------+----------+-------------+-------------+");

        double genelToplam = 0.0;
        for (int i=0; i <urunler.length; i++) {
            double toplam = fiyatlar[i] * miktarlar[i];
            genelToplam += toplam;
            System.out.printf("| %-15s | %8d | %11.2f | %11.2f |\n",
                    urunler[i], miktarlar[i], fiyatlar[i], toplam);

        }

        System.out.println("+-----------------+----------+-------------+-------------+");
        System.out.printf("| %-15s | %8s | %11s | %11.2f |\n", "Genel Toplam", "", "", genelToplam);
        System.out.println("+-----------------+----------+-------------+-------------+");

    }


}
