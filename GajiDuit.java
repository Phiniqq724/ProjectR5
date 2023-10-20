import java.util.Scanner;

public class GajiDuit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tahunkerja;
        double gaji, totalgaji;
        String nama;
        gaji = 3000000;

        System.out.println(" === Halaman Ambil Gaji Karyawan ===");
        System.out.print("Masukkan nama = ");
        nama = in.nextLine();
        System.out.print("Masukkan tahun kerja = ");
        tahunkerja = in.nextInt(); System.out.print("Tahun");

        if(tahunkerja >= 3) {
            totalgaji = gaji + 300000;
            totalgaji = totalgaji / 1000000;
            System.out.println("=== TOTAL GAJI === \n Nama = " + nama + " \n Total gaji mu = " + totalgaji +"Jt");
        } else {
            totalgaji = gaji + 150000;
            totalgaji = totalgaji / 1000000;
            System.out.println("=== TOTAL GAJI === \n Nama = " + nama + " \n Total gajimu = " + totalgaji +"Jt");
        }
    }
}
