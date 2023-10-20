import java.util.Scanner;

public class PemilihanKamar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double jumlahmalam, harga, total;
        char pilihan, loop;
        harga = 0;
        while(true) {
            System.out.println("== Selamat Datang di Hotel ULTRA PREMIUM ANJAY == \n 1. Kamar Levana = 450k/malam \n 2. Kamar Merapi = 750k/malam \n 3. Kamar Sativa = 900k/malam");
            System.out.print("Pilihh kode kamar = ");
            pilihan = in.next().charAt(0);

            System.out.println("Mau pesan untuk berapa malam? ");
            jumlahmalam = in.nextDouble();

            switch(pilihan) {
                case '1':
                    harga = harga + 450000 * jumlahmalam;
                    break;
                case '2':
                    harga = harga + 750000 * jumlahmalam;
                    break;
                case '3':
                    harga = harga + 900000 * jumlahmalam;
                    break;
                default:
                    System.out.println("ERROR");
                    return;
            }

            System.out.println("Apakahh mau pesan lagi ? \n Y/N");
            loop = in.next().charAt(0);

            if(loop == 'N') {
                break;
            }
        }

        System.out.println("=== Total === \n Total harga = " + harga);
        
        
        
    }
}
