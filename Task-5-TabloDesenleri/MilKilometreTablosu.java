public class DonusumTablosu {
    public static void main(String[] args) {
        double[] mil = {1, 5, 10, 20, 50};

        System.out.println("+-----------+----------------+");
        System.out.printf("| %-9s | %-14s |\n", "Mil", "Kilometre");
        System.out.println("+-----------+----------------+");

        for(int i = 0; i < mil.length; i++){
            double km = mil[i] * 1.609;
            System.out.printf("| %9.2f | %14.2f |\n", mil[i], km);

        }

        System.out.println("+-----------+----------------+");
    }
}
