import java.util.Scanner;

public class HitungBMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama = ");
        String nama = in.nextLine();

        System.out.print("Masukkan tinggi badan(meter) " + nama + " = ");
        double tinggi = in.nextDouble();

        System.out.print("Masukkan berat badan(kg) " + nama + " = ");
        double berat = in.nextDouble();

        double bmi = berat / (tinggi * tinggi);
        System.out.println("=== KALKULATOR BMI === \n Nama = " + nama + "\n BMI = " + bmi);
        if(bmi < 18.5) {
            System.out.println(" Berat badang kurang");
        } else if (bmi > 18.5 && bmi <24.9) {
            System.out.println(" Berat badan normal");
        } else if (bmi > 25 && bmi < 29) {
            System.out.println(" Berat badan berlebihan");
        } else {
            System.out.println(" DASAR OBESITAS");
        }

        
    }
}
