import java.util.Scanner;

public class BandingkanSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu pertama (Celcius): ");
        double suhu1 = input.nextDouble();

        System.out.print("Masukkan suhu kedua (Celcius): ");
        double suhu2 = input.nextDouble();
        input.close();

        if (suhu1 > suhu2) {
            System.out.println("Suhu pertama lebih tinggi.");
        } else if (suhu2 > suhu1) {
            System.out.println("Suhu kedua lebih tinggi.");
        } else {
            System.out.println("Kedua suhu sama.");
        }
    }
}