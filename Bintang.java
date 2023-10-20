import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahbaris, jumlahbintang;
        System.out.print("Masukkan jumlah bintang = ");
        jumlahbintang = in.nextInt();
        System.out.print("Masukkan jumlah baris = ");
        jumlahbaris = in.nextInt();
        for(int count1 = 0; count1<jumlahbaris; count1++){
            for(int count2 = 0; count2<jumlahbintang; count2++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
