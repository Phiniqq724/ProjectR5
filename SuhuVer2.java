import java.util.Scanner;

public class SuhuVer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double hasil;
        boolean loop = false;
        char pil;
        while(true) {
            System.out.print("== KALKULATOR SUHU 2.0 == \n K. Kelvin\n R. Reamur \n F. Fahrenheit \n Input = ");
            char pilihan = in.next().charAt(0);
            System.out.print(" Masukkan suhu Celcius = ");
            double celcius = in.nextDouble();
            switch(pilihan) {
                case 'K':
                case 'k':
                    System.out.println("== SUHU KELVIN ==");
                    hasil = celcius + 273;
                    System.out.println(" Hasil = " + hasil);
                    break;
                case 'R':
                case 'r':
                    System.out.println("== SUHU REAMUR ==");
                    hasil = ( 4.0 / 5.0 * celcius);
                    System.out.println(" Hasil = " + hasil);
                    break;
                case 'F':
                case 'f':
                    System.out.println("== SUHU FAHRENHEIT == ");
                    hasil = (9.0 / 5.0 * celcius) +32;
                    System.out.println(" Hasil = " + hasil);
                    break;
                default:
                    System.out.println(" == GA ADA PILIHANNYA KOCAK == ");
                    break;
            }

            System.out.print("Lanjut? \n T/F = ");
            pil = in.next().charAt(0);

            if (pil == 'T'){
            } else if (pil == 'F') {
                break;
            }


            
        }
        
    }
}
