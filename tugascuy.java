import java.util.Scanner;

public class tugascuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai awal = ");
        int nial = in.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        int niak = in.nextInt();
        System.out.print("Ganjil atau genap? [g/g]");
        char isi = in.next().charAt(0);

        int total = 0;
        switch(isi){
            case 'g':
                do{
                    if(nial%2==0){
                        System.out.print(nial+", ");
                        total = total + nial;
                    }   
                    nial++;
            
                } 
                while(nial <= niak);
                System.out.print("total = "+total);
                break;
            case 'G':
                do{
                    if(nial%2!=0){
                        System.out.print(nial+", ");
                        total = total + nial;
                    }   
                    nial++;
            
                } 
                while(nial <= niak);
                System.out.print("total = "+total);
                break;
            default:
                System.out.println("SHUT THE FUC* UP");
                break;
            }
    }
}
