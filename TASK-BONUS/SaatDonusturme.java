public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 4856;

        int saat = toplamSaniye / 3600;
        int kalan = toplamSaniye % 3600;
        int dakika = kalan / 60;
        int saniye = kalan % 60;

        System.out.println("Toplam saniye: " + toplamSaniye);
        System.out.println("Saat:Dakika:Saniye -> " + saat + ":" + dakika + ":" + saniye);
    }
}
