import java.util.Scanner;

public class cottage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Masukkan pilihan Hotel: \n 1. Levana \n 2. Merapi \n 3. Sativa");
        String  jenis = input.nextLine();
        System.out.println("masukkan jumlah malam: ");
        int jumlahMalam = input.nextInt();
        int harga =0;

        if(jenis.equalsIgnoreCase("Levana")){
            harga=450000;
        }else if(jenis.equalsIgnoreCase("Merapi")){
            harga=750000;
        }else{
            harga=900000;
        }

        // switch(jenis){
        //     case 1:
        //     harga = 450000;
        //     break;
        //     case 2:
        //     harga = 750000;
        //     break;
        //     case 3:
        //     harga =900000;
        //     break;

        // }

        int total = jumlahMalam * harga;
        System.out.println("Total yang harus dibayarkan: RP"+total);


    }
    
}
