import java.util.Scanner;

public class ListrikFisika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pemakaian, biaya = 0, tarif, pajak, tagihan;

        System.out.println("== Listrik ==");
        System.out.print(" Masukkan pemakaian per jam (kWh) = ");
        pemakaian = in.nextDouble();

        if(pemakaian <= 50) {
            tarif = 100;
            biaya = pemakaian * tarif;
        } else if (pemakaian <= 150) {
            tarif = 150;
            biaya = pemakaian * tarif;
        } else if (pemakaian <= 250) {
            tarif = 250;
            biaya = pemakaian * tarif;
        } else if (pemakaian > 250) {
            tarif = 300;
            biaya = pemakaian * tarif;
        }

        
        pajak = biaya * (20.0 / 100.0);

        tagihan = pajak + biaya;

        System.out.println("=== TOTAL BIAYA === \n Biaya bersih = " + biaya + "\n Pajak = " + pajak + "\n Total = " + tagihan);
        
    }
}
