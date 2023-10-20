import java.util.Scanner;

public class PersiapanUjian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number1, number2, progress, number3, x1, x2, progress0;
        char rumus, inrumus, pilih;
        int count = 0;

        while(true) {
            System.out.println("== KALKULATOR RUMUS by Farel code name Caesium ==");
            System.out.print(" => Pilihan rumus \n 1. Rumus luas dan keliling bangun datar \n 2. Rumus aljabar \n 3. Rumus geometri 3D \n 4. Rumus fisika \n Pilih angka = ");
            rumus = in.next().charAt(0);
            final double pi = 3.14;

            switch(rumus) {
                case '1':
                    System.out.print("== Rumus luas dan keliling bangun datar == \n --> Pilihan rumus \n a. Luas persegi \n b. Keliling persegi \n c. Luas segitiga \n d. Keliling segitiga \n e. Luas lingkaran \n f. Keliling lingkaran \n g. (SOON) \n Pilih char = ");
                    inrumus = in.next().charAt(0);
                    switch(inrumus) {
                        case 'a':
                            System.out.print("Pilihan rumus = Luas Persegi");
                            System.out.print("  Masukkan S (sisi)  = ");
                            number1 = in.nextDouble();
                            progress = number1 * number1;
                            System.out.println("  Luas persegi dari sisi " + number1 + " = " + progress);
                            break;
                        case 'b':
                            System.out.print(" --> Pilihan rumus = Keliling persegi \n  Masukkan S (sisi) = ");
                            number1 = in.nextDouble();
                            progress = 4 * number1;
                            System.out.println("  Keliling persegi dari sisi " + number1 + " = " +progress);
                            break;
                        case 'c':
                            System.out.print(" --> Pilihan rumus = Luas segitiga\n  Masukkan alas = ");
                            number1 = in.nextDouble();
                            System.out.print("  Masukkan tinggi = ");
                            number2 = in.nextDouble();
                            progress = 0.5 * number1 * number2;
                            System.out.println("  Luas segitiga dari alas " + number1 + " dan tinggi " + number2 + " = " + progress);
                            break;
                        case 'd':
                            System.out.print(" -->Pilihan rumus = Keliling segitiga \n Masukkan sisi A = ");
                            number1 = in.nextDouble();
                            System.out.print("  Masukkan sisi B = ");
                            number2 = in.nextDouble();
                            System.out.print("  Masukkan sisi C = ");
                            number3 = in.nextDouble();
                            progress = number1 + number2 + number3;
                            System.out.println("  Keliling segitiga tersebut adalah = " + progress);
                            break;
                        case 'e':
                            System.out.print(" -->Pilihan rumus = Luas lingkaran \n  Masukkan jari jari(r) = ");
                            number1 = in.nextDouble();
                            progress = pi * number1 * number1;
                            System.out.println("  Luas lingkaran dari jari jari " + number1 + " = " + progress);
                            break;
                        case 'f':
                            System.out.print(" -->Pilihan rumus = Keliling lingkaran \n  Masukkan jari jari(r) = ");
                            number1 = in.nextDouble();
                            progress = 2 * pi * number1;
                            System.out.println("  Keliling lingkaran dari jari jari " + number1 + " = " + progress);
                            break;
                        case 'g':
                            System.out.println("COMING SOON !!");
                            return;
                        default:
                            System.out.println("ERROR 404");
                            return;
                    }
                break;
                case '2':
                    System.out.print("== RUMUS ALJABAR (BETA) ==\n --> Pilihan rumus\n a. Persamaan Kuadrat\n b. Rumus presentase \n c. Rumus rata rata (mean)\n Pilih char = ");
                    inrumus = in.next().charAt(0);
                    switch(inrumus) {
                        case 'a':
                            System.out.print(" --> Pilihan rumus = Persamaan kuadrat \n  Masukkan a = ");
                            number1 = in.nextDouble();
                            System.out.print("  Masukkan b = ");
                            number2 = in.nextDouble();
                            System.out.print("  Masukkan c = ");
                            number3 = in.nextDouble();
                            x1 = ((-1) * number2 + (Math.sqrt((number2 * number2) - (4.0 * number1 * number3)))) / 2.0 * number1 ;
                            x2 = ((-1) * number2 - (Math.sqrt(number2 * number2 - (4.0 * number1 * number3)))) / 2.0 * number1;
                            System.out.println("  X1 dan X2 dari persamaan " + number1 +"X^2 + " + number2+ "X + " + number3 + " = 0 adalah " + x1 + " & " + x2);
                            break;
                        case 'b':
                            System.out.print(" --> Pilihan rumus = Rumus presentase \n  Masukkan jumlah bagian = ");
                            number1 = in.nextDouble();
                            System.out.print("  Masukkan jumlah total(Jumlah keseluruhan) = ");
                            number2 = in.nextDouble();
                            progress = number1 / number2 * 100;
                            System.out.println("  Presentasenya adalah = " + progress +"%");
                            break;
                        case 'c':
                            System.out.print(" --> Pilihan rumus = Rumus rata rata \n Masukkan jumlah angka yang mau dibikin rata rata(max. 3) = ");
                            count = in.nextInt();
                            if(count == 1) {
                                System.out.println("  Masukkan angka = ");
                                number1 = in.nextDouble();
                                progress = number1 / count;
                            } else if(count == 2) {
                                System.out.print("  Masukkan angka 1 = ");
                                number1 = in.nextDouble();
                                System.out.print("  Masukkan angka 2 = ");
                                number2 = in.nextDouble();
                                progress = (number1 + number2) / count;
                            } else if(count == 3) {
                                System.out.print("  Masukkan angka 1 = ");
                                number1 = in.nextDouble();
                                System.out.print("  Masukkan angka 2 = ");
                                number2 = in.nextDouble();
                                System.out.print("  Masukkan angka 3 = ");
                                number3 = in.nextDouble();
                                progress = (number1 + number2 + number3) / count;
                            } else {
                                System.out.println("ERROR 406");
                                return;
                            }
                            System.out.println("  Rata rata dari bilangan tersebut adalah " + progress);
                            break;
                        default:
                            System.out.println("ERROR 404");
                            return;
                    }
                break;
                case '3':
                    System.out.println("== RUMUS GEOMETRI 3D == \n --> Pilihan rumus\n a. Rumus volume kubus\n b. Rumus volume balok\n c. Rumus volume bola\n d. Rumus volume kerucut\n e. Rumus volume prisma segitiga \n f. Rumus volume limas\n g. (SOON)");
                    System.out.print("Pilih char = ");
                    inrumus = in.next().charAt(0);
                    switch(inrumus) {
                        case 'a':
                            System.out.println(" --> Pilihan rumus = Volume kubus");
                            System.out.print("  Masukkan nilai sisi (S) = ");
                            number1 = in.nextDouble();
                            progress = number1 * number1 * number1;
                            System.out.println("  Volume kubus dari kubus bersisi " + number1 +" = " + progress);
                            break;
                        case 'b':
                            System.out.print(" --> Pilihan rumus = Volume balok\n  Masukkan nilai panjang(p) = ");
                            number1 = in.nextDouble();
                            System.out.println("  Masukkan nilai lebar(l) = ");
                            number2 = in.nextDouble();
                            System.out.println("  Masukkan nilai tinggi = ");
                            number3 = in.nextDouble();
                            progress = number1 * number2 * number3;
                            System.out.println("  Volume balok nya adalah = " + progress );
                            break;
                        case 'c':
                            System.out.print(" --> Pilihan rumus = Volume bola \n  Masukkan nilai jari jari(r) = ");
                            number1 = in.nextDouble();
                            progress = (4.0/3.0) * pi * number1 * number1 * number1;
                            System.out.println("  Volume bola dengan jari jari " + number1 + " = " + progress);
                            break;
                        case 'd':
                            System.out.print(" --> Pilihan rumus = Volume kerucut \n  Masukkan nilai jari jari(r) = ");
                            number1 = in.nextDouble();
                            System.out.println("  Masukkan nilai tinggi = ");
                            number2 = in.nextDouble();
                            progress = (1.0/3.0) * pi * number1*number1*number2;
                            System.out.println("  Volume kerucut dengan jari jari " + number1 + " dan tinggi " + number2 +" = " + progress);
                            break;
                        case 'e':
                            System.out.print(" --> Pilihan rumus = Volume prisma segitiga \n  Masukkan alas = ");
                            number1 = in.nextDouble();
                            System.out.print("  Masukkan tinggi = ");
                            number2 = in.nextDouble();
                            System.out.print("  Masukkan tinggi prisma = ");
                            number3 = in.nextDouble();
                            progress = ((number1*number2) / 2.0 ) * number3;
                            System.out.println("  Volume prisma segitiga tersebut adalah = " + progress);
                            break;
                        case 'f':
                            System.out.print(" --> Pilihan Rumus = Volume limas \n  Masukkan panjang = ");
                            number1 = in.nextDouble();
                            System.out.print("  Masukkan lebar = ");
                            number2 = in.nextDouble();
                            System.out.print("  Masukkan tinggi = ");
                            number3 = in.nextDouble();
                            progress0 = number1 * number2;
                            progress = (1.0/3.0) * progress0 * number3;
                            System.out.println("  Volume limas tersebut adalah " + progress);
                            break;
                        case 'g':
                            System.out.println("ERROR 407");
                            return;
                        default:
                            System.out.println("ERROR");
                            return;
                    }
                break;
                case '4':
                    System.out.println("== RUMUS FISIKA(BETA) ==\n --> Pilihan rumus \n a. (SOON)");
                    return;
            }
            System.out.print(" -==| TERIMAKASIH TELAH MENGGUNAKAN JASA KAMI |==-\n Apakah mau menghitung lagi ? Y/N\n Input = ");
            pilih = in.next().charAt(0);
            if(pilih == 'Y') {

            } else if(pilih == 'N') {
                return;
            }
        }
    }
}
