import java.util.Random;
import java.util.Scanner;

public class GacorKang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        Random random = new Random(666);

        String nama, pass, passIn;
        int togel1, togel2, togel3, togel4, togelIn1, togelIn2, togelIn3, togelIn4, point=0;

        togel1 = random.nextInt(10);
        togel2 = random.nextInt(10);
        togel3 = random.nextInt(10);
        togel4 = random.nextInt(10);


        System.out.println("========ZEUS 32========");
        System.out.println("=======GACOR KANG======");

        System.out.print("Input Nama: ");
        nama = input.nextLine();

        System.out.print("Input Pass: ");
        passIn = input.nextLine();

        if (!passIn.equals("WikusamaHebat")){
            return;
        }

        System.out.println("======Selamat Datang======");

        System.out.print("Input Angka 1: ");
        togelIn1 = input.nextInt();

        System.out.print("Input Angka 2: ");
        togelIn2 = input.nextInt();

        System.out.print("Input Angka 3: ");
        togelIn3 = input.nextInt();

        System.out.print("Input Angka 4: ");
        togelIn4 = input.nextInt();

        if (togel1 == togelIn1){
            ++point;
        } else if (togel2 == togelIn2){
            ++point;
        } else if (togel3 == togelIn3){
            ++point;
        } else if (togel4 == togelIn4){
            ++point;
        } 

        System.out.println("======Apakah Cacor?======");
        System.out.println("Angka Hari Ini: "+togel1+togel2+togel3+togel4);
        System.out.println("Poin anda adalah: " +point);
    }
}
