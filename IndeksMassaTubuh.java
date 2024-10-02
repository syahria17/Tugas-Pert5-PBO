package tugaspert5;

import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat badan dan tinggi badan
        System.out.print("Berat badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Hitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Tentukan kriteria berdasarkan IMT
        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Output
        System.out.println("\nOutput:");
        System.out.println("IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
    }
}
