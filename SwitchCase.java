import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hari, alasan;
        System.out.print("Kode hari = ");
        hari = in.nextInt();

        switch(hari) {
            case 1:
                System.out.println("Hari senin");
                break;
            case 2:
                System.out.println("Hari selasa");
                break;
            case 3:
                System.out.println("Hari rabu");
                break;
            case 4:
                System.out.println("Hari kamis");
                break;
            case 5:
                System.out.println("Hari jumat berkah masyaallah");
                break;
            case 6:
                System.out.println("Hari sabtu");
                break;
            case 7:
                System.out.println("Hari minggu");
                break;
            default:
                System.out.println("ERROR CODE : 990X");
                System.out.print("Kenapa kamu pilih angka tersebut? \n Opsi : \n 1. Karna malas \n 2. Karna benci \n 3. Cuman canda bang :cry:\n Jawabanmu = ");
                alasan = in.nextInt();

                if(alasan == 1) {
                System.out.println("Ywdh si");
                } else if (alasan == 2) {
                System.out.println("MATI LU");
                } else if (alasan == 3) {
                System.out.println("Ywdh sih");
                } else {
                System.out.println("GA ADA OPSINYA");
                }
                break;
        }
        

        

    }
}
