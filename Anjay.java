import java.util.Scanner;
public class Anjay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jumlahnilai, jumlah;
        double nilai, rata;
        jumlahnilai = 0;

        System.out.println("KALKULATOR NILAI RATA RATA");
        System.out.print(" Masukkan jumlah nilai = ");
        jumlah = in.nextInt();
        for(int i = 1; i <= jumlah;i++){
            System.out.print(" Nilai "+i+" = ");
            nilai = in.nextInt();
            jumlahnilai += nilai;
        }
        System.out.println(" Hasil nilai = " + jumlahnilai);
        rata = jumlahnilai/jumlah;
        System.out.println(" Rata rata nilai = " + rata);
    }
}
