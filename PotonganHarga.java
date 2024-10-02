package tugaspert5;

import java.util.Scanner;

public class PotonganHarga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Total pembelian Rp.: ");
        double totalPembelian = input.nextDouble();

        // Tentukan besarnya potongan
        double potongan;
        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.2 * totalPembelian;
        }

        // Hitung jumlah yang harus dibayarkan
        double totalBayar = totalPembelian - potongan;

        // Output
        System.out.println("\nOutput:");
        System.out.println("Total pembelian Rp.: " + totalPembelian);
        System.out.println("Besarnya potongan Rp.: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp.: " + totalBayar);
    }
}
