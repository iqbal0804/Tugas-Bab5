package BAB5_PrakPL;

public class ClassNo1 {

    static double hasiljumlah, hasilkurang;
    double hasilkali, hasilbagi, Progsederhana;

    public static void Penjumlahan(double x, double y) {
        hasiljumlah = x + y;
    }

    public static void Pengurangan(double x, double y) {
        hasilkurang = x - y;
    }

    public void Perkalian(double x, double y) {
        hasilkali = x * y;
    }

    public void Pembagian(double x, double y) {
        hasilbagi = x / y;
    }

    public void Progsederhana() {
        hasiljumlah = Math.round(hasiljumlah);
        hasilkurang = Math.round(hasilkurang);
        hasilkali = Math.round(hasilkali);
        hasilbagi = Math.round(hasilbagi);
    }
}
