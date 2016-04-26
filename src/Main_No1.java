package BAB5_PrakPL;

import java.util.Scanner;

public class Main_No1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;

        ClassNo1 hitung = new ClassNo1();
        do {
            System.out.println("Program Perhitungan Java");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();

            double x, y;
            switch (pilihan) {
                case 1:
                    System.out.println("\tPenjumlahan");
                    System.out.print("Nilai x = ");
                    x = in.nextDouble();
                    System.out.print("Nilai y = ");
                    y = in.nextDouble();
                    ClassNo1.Penjumlahan(x, y);
                    hitung.Progsederhana();
                    System.out.println("=======================================");
                    System.out.println("Hasil dari " + x + " + " + y + " = " + ClassNo1.hasiljumlah);
                    System.out.println("=======================================");

                    break;
                case 2:
                    System.out.println("\tPengurangan");
                    System.out.print("Nilai x = ");
                    x = in.nextDouble();
                    System.out.print("Nilai y = ");
                    y = in.nextDouble();
                    ClassNo1.Pengurangan(x, y);
                    hitung.Progsederhana();
                    System.out.println("=======================================");
                    System.out.println("Hasil dari " + x + " - " + y + " = " + ClassNo1.hasilkurang);
                    System.out.println("=======================================");
                    break;
                case 3:
                    System.out.println("\tPerkalian");
                    System.out.print("Nilai x = ");
                    x = in.nextDouble();
                    System.out.print("Nilai y = ");
                    y = in.nextDouble();
                    hitung.Perkalian(x, y);
                    hitung.Progsederhana();
                    System.out.println("=======================================");
                    System.out.println("Hasil dari " + x + " X " + y + " = " + hitung.hasilkali);
                    System.out.println("=======================================");
                    break;
                case 4:
                    System.out.println("\tPembagian");
                    System.out.print("Nilai x = ");
                    x = in.nextDouble();
                    System.out.print("Nilai y = ");
                    y = in.nextDouble();
                    hitung.Pembagian(x, y);
                    hitung.Progsederhana();
                    System.out.println("=======================================");
                    System.out.println("Hasil dari " + x + " / " + y + " = " + hitung.hasilbagi);
                    System.out.println("=======================================");
                    break;
                default:
                    if (pilihan == 0) {
                        break;
                    }
                    System.out.println("Maaf, Pilihan Anda Tidak Tersedia");
            }

        } while (pilihan != 0);
        System.out.println("\t     Terima Kasih dan Jangan Kapok Berhitung");
    }
}
