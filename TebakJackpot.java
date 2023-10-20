import java.util.Scanner;

public class TebakJackpot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tebakan, jackpot;

        System.out.print("== ADMIN == \n Masukkan jackpot = ");
        jackpot = in.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        while(true) {
            
            System.out.print("== GAME TEBAK JACKPOT == \n Tebak Jackpot = ");
            tebakan = in.nextInt();

            if(tebakan == jackpot) {
                System.out.println(" JACKPOT!!");
                return;
            } else if (tebakan < jackpot) {
                System.out.println(" Kurang banyak");
            } else if (tebakan > jackpot) {
                System.out.println(" Kelebihan woi");
            }

        }  
    }
    
}
