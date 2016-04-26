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
               