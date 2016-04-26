package BAB5_PrakPL2;

public class ClassJacket {

    final int A = 100000;
    final int B = 125000;
    final int C = 175000;
    int jacketA, jacketB, jacketC,totalA, totalB, totalC;
 

    public void DiskonA(int jumlah) {
        if (jumlah > 100) {
            jacketA = A - 5000;
            totalA = jacketA * jumlah;
            System.out.println("Harga Jacket A = " + jacketA);
            System.out.println("Harga Total Seluruh Pembelian Jacket A = " + totalA);
        } else {
            totalA = A * jumlah;
            System.out.println("Harga Jacket A = " + A);
            System.out.println("Harga Total Seluruh Pembelian Jacket A = " + totalA);
        }
    }

    public void DiskonB(int jumlah) {
        if (jumlah > 100) {
            jacketB = B - 5000;
            totalB = jacketB * jumlah;
            System.out.println("Harga Jacket B = " + jacketB);
            System.out.println("Harga Total Seluruh Pembelian Jacket B = " + totalB);
        } else {
            totalB = B * jumlah;
            System.out.println("Harga Jacket B = " + B);
            System.out.println("Harga Total Seluruh Pembelian Jacket B = " + totalB);
        }
    }

    public void DiskonC(int jumlah) {
        if (jumlah > 100) {
            jacketC = C - 15000;
            totalC = jacketC * jumlah;
            System.out.println("Harga Jacket C = " + jacketC);
            System.out.println("Harga Total Seluruh Pembelian Jacket C = " + totalC);
        } else {
            totalC = C * jumlah;
            System.out.println("Harga Jacket C = " + C);
            System.out.println("Harga Total Seluruh Pembelian Jacket C = " + totalC);
        }
    }
}
