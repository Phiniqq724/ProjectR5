import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Indonesia, Produktif, Informatika, PPKn, Agama, average;
        System.out.print("Masukkan nama = ");
        String nama = in.nextLine();
        System.out.print("Masukkan nilai Bahasa Indonesia = ");
        Indonesia = in.nextDouble();
        System.out.print("Masukkan nilai Produktif = ");
        Produktif = in.nextDouble();
        System.out.print("Masukkan nilai Informatika = ");
        Informatika = in.nextDouble();
        System.out.print("Masukkan nilai PPKn = ");
        PPKn = in.nextDouble();
        System.out.print("Masukkan nilai Agama = ");
        Agama = in.nextDouble();

        average = (Indonesia + Produktif + Informatika + PPKn + Agama)/5;

        System.out.println("=== RATA RATA NILAI === \n Nama = " + nama + "\n Nilai rata rata = " + average);

        if(average > 96 && average <= 100) {
            System.out.println(" Predikat = A");
            System.out.println(" Kriteria = Sangat Baik");
        } else if(average < 96 && average > 91) {
            System.out.println(" Predikat = A-");
            System.out.println(" Kriteria = Sangat Baik");
        } else if (average < 90 && average > 85) {
            System.out.println(" Predikat = B+");
            System.out.println(" Kriteria = Baik");
        } else if (average < 85 && average > 81) {
            System.out.println(" Predikat = B");
            System.out.println(" Kriteria = Baik");
        } else if (average < 81 && average > 75) {
            System.out.println(" Predikat = B-");
            System.out.println(" Kriteria = Baik");
        } else if(average < 75 && average > 70) {
            System.out.println(" Predikat = C+");
            System.out.println(" Kriteria = Cukup");
        } else if(average < 70 && average > 65) {
            System.out.println(" Predikat = C");
            System.out.println(" Kriteria = Cukup");
        } else if(average < 65 && average > 60) {
            System.out.println(" Predikat = C-");
            System.out.println(" Kriteria = Cukup");
        } else if(average < 60 && average > 55) {
            System.out.println(" Predikat = D+");
            System.out.println(" Kriteria = Kurang");
        } else if(average < 55 && average > 0){
            System.out.println(" Predikat = D");
            System.out.println(" Kriteria = Kurang");
        }


    }
}
