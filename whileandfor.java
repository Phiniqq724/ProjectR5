import java.util.Scanner;

public class whileandfor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baris, kali, angka = 0;
        boolean xx = true;

        System.out.print("Berapa baris = ");
        baris = in.nextInt();
        System.out.print("Berapa kali = ");
        kali = in.nextInt();
        while(xx = true) {
            angka++;
            for(int i = 1; i <= baris; i++) {
                for(int a = 1; a <= i; a++){
                    System.out.print(a+" ");
                }
                System.out.print("\n");
            }
            if(angka == kali) {
                break;
            } else {}
        }
    }
}
