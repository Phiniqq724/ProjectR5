import java.util.Scanner;

public class chooseyourchar {
    public static void main(String[] args) {
        character haza = new character();
        character ryo = new character();
        character daniel = new character();
        character dviki = new character();
        character fahri = new character();
        character farel = new character();
        character aad = new character();

        //Stat haza
        haza.hp = 100;
        haza.mana = 100;
        haza.nama = "Haza";
        haza.power();
        
        //Stat ryo
        ryo.hp = 200;
        ryo.mana = 100;
        ryo.nama = "Ryo";
        ryo.power();

        //Stat daniel
        daniel.hp = 500;
        daniel.mana = 50;
        daniel.nama = "Daniel";
        daniel.power();
        
        //Stat dviki
        dviki.hp = 400;
        dviki.mana = 25;
        dviki.nama = "Dviki";
        dviki.power();

        //Stat fahri
        fahri.hp = 100;
        fahri.mana = 200;
        fahri.nama = "Fakhri";
        fahri.power();

        //Stat farel
        farel.hp = 100;
        farel.mana = 300;
        farel.nama = "Fahrell";
        farel.power();

        //Stat aad
        aad.hp = 300;
        aad.mana = 200;
        aad.nama = "Aad";
        aad.power();

        //Start Code
        Scanner in = new Scanner(System.in);
        char jawaban = 'N';
        while(jawaban == 'N'){
            System.out.print(" || Choose Your Character || \n  1. Haza\n  2. Ryo\n  3. Daniel\n  4. Dviki\n  5. Fakhri\n  6. Fahrell\n == Information ==\n  a. Haza\n  b. Ryo\n  c. Daniel\n  d. Dviki\n  e. Fakhri\n  f. Fahrell\n  Input = ");
            char pilih = in.next().charAt(0);
            switch(pilih){
                case '1':
                    System.out.println(" !!Choosed!! " + haza.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + haza.hp);
                    System.out.println(" > Total Mana   = " + haza.mana);
                    System.out.println(" > Total Power  = " + haza.power);
                    jawaban = 'y';
                    break;
                case '2':
                    System.out.println(" !!Choosed!! " + ryo.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + ryo.hp);
                    System.out.println(" > Total Mana   = " + ryo.mana);
                    System.out.println(" > Total Power  = " + ryo.power);
                    jawaban = 'y';
                    break;
                case '3':
                    System.out.println(" !!Choosed!! " + daniel.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + daniel.hp);
                    System.out.println(" > Total Mana   = " + daniel.mana);
                    System.out.println(" > Total Power  = " + daniel.power);
                    jawaban = 'y';
                    break;
                case '4':
                    System.out.println(" !!Choosed!! " + dviki.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + dviki.hp);
                    System.out.println(" > Total Mana   = " + dviki.mana);
                    System.out.println(" > Total Power  = " + dviki.power);
                    jawaban = 'y';
                    break;
                case '5':
                    System.out.println(" !!Choosed!! " + fahri.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + fahri.hp);
                    System.out.println(" > Total Mana   = " + fahri.mana);
                    System.out.println(" > Total Power  = " + fahri.power);
                    jawaban = 'y';
                    break;
                case '6':
                    System.out.println(" !!Choosed!! " + farel.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + farel.hp);
                    System.out.println(" > Total Mana   = " + farel.mana);
                    System.out.println(" > Total Power  = " + farel.power);
                    jawaban = 'y';
                    break;
                case '7':
                    System.out.println(" !!Choosed!! " + aad.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + aad.hp);
                    System.out.println(" > Total Mana   = " + aad.mana);
                    System.out.println(" > Total Power  = " + aad.power);
                    jawaban = 'y';
                    break;
                case 'a':
                    System.out.println(" INFORMASI STAT " + haza.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + haza.hp);
                    System.out.println(" > Total Mana   = " + haza.mana);
                    System.out.println(" > Total Power  = " + haza.power);
                    break;
                case 'b':
                    System.out.println(" INFORMASI STAT " + ryo.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + ryo.hp);
                    System.out.println(" > Total Mana   = " + ryo.mana);
                    System.out.println(" > Total Power  = " + ryo.power);
                    break;
                case 'c':
                    System.out.println(" INFORMASI STAT " + daniel.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + daniel.hp);
                    System.out.println(" > Total Mana   = " + daniel.mana);
                    System.out.println(" > Total Power  = " + daniel.power);
                    break;
                case 'd':
                    System.out.println(" INFORMASI STAT " + dviki.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + dviki.hp);
                    System.out.println(" > Total Mana   = " + dviki.mana);
                    System.out.println(" > Total Power  = " + dviki.power);
                    break;
                case 'e':
                    System.out.println(" INFORMASI STAT " + fahri.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + fahri.hp);
                    System.out.println(" > Total Mana   = " + fahri.mana);
                    System.out.println(" > Total Power  = " + fahri.power);
                    break;
                case 'f':
                    System.out.println(" INFORMASI STAT " + farel.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + farel.hp);
                    System.out.println(" > Total Mana   = " + farel.mana);
                    System.out.println(" > Total Power  = " + farel.power);
                    break;
                case 'g':
                    System.out.println(" INFORMASI STAT " + aad.nama);
                    System.out.println(" Stats = ");
                    System.out.println(" > Total HP     = " + aad.hp);
                    System.out.println(" > Total Mana   = " + aad.mana);
                    System.out.println(" > Total Power  = " + aad.power);
                    break;
            }

        }
        
    }
}
