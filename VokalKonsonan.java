import java.util.Scanner;
public class VokalKonsonan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char huruf;
        System.out.print("VokalKonsonan Scanner ! \n Masukkan huruf = ");
        huruf = in.next().charAt(0);

        switch(huruf) {
            case 'A':
            case 'I':
            case 'U':
            case 'E':
            case 'O':
            case 'a':
            case 'i':
            case 'u':
            case 'e':
            case 'o':
                System.out.println(" Huruf vokal");
                break;
            default:
                System.out.println(" Huruf konsonan");
        }
    }
}
