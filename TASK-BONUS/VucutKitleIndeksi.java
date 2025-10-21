public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo = 65;
        double boy = 1.70;

        double bmi = kilo / (boy*boy);


        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Boy: " + boy + " m");
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f\n", bmi);


        if (bmi < 18.5) {
            System.out.println("Kategori: Zayıf");
        }else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Kategori: Normal");
        }else if (bmi > 24.9 && bmi < 29.9) {
            System.out.println("Kategori: Fazla Kilolu");
        }else {
            System.out.println("Kategori: Obez");
        }
    }
}
