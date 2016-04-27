
package BAB5_PrakPL2;

import java.util.Scanner;

public class MainJacket {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ClassJacket Jacket = new ClassJacket();
        int pilihan;
        int jumlah;
        System.out.println("CV. Labkomdas Jacket Production");
        do {
            System.out.println("=========PEMESANAN JACKET============");
            System.out.println("1. Paket Jacket bahan A ");
            System.out.println("2. Paket Jacket bahan B ");
            System.out.println("3. Paket Jacket bahan C ");
            System.out.println("4. Pemesanan Selesai");
            System.out.print("Masukan pilihan anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Jumlah Jacket yang Ingin di Pesan : ");
                    jumlah = in.nextInt();
                    if (jumlah > 100) {
                        System.out.println("Selamat Anda Mendapat Potongan Harga Rp. 5000 / Jacket! ");
                    }
                    Jacket.DiskonA(jumlah);
                    break;
                case 2:
                    System.out.print("Masukan Jumlah Jacket yang Ingin di Pesan : ");
                    jumlah = in.nextInt();
                    if (jumlah > 100) {
                        System.out.println("Selamat Anda Mendapat Potongan Harga Rp. 5000 / Jacket! ");
                    }
                    Jacket.DiskonB(jumlah);
                    break;
                case 3:
                    System.out.print("Masukan Jumlah Jacket yang Ingin di Pesan : ");
                    jumlah = in.nextInt();
                    if (jumlah > 100) {
                        System.out.println("Selamat Anda Mendapat Potongan Harga Rp. 15000 / Jacket! ");
                    }
                    Jacket.DiskonC(jumlah);
                    break;
            }
        } while (pilihan <= 3);
        System.out.println("Terimakasih Sudah Memesan di CV.Labkomdas! ");
    }
}
