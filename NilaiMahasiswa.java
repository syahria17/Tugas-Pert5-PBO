package tugaspert5;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        // Tentukan grade dan keterangan
        String grade;
        String keterangan;
        if (nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else {
            grade = "A";
            keterangan = "ISTIMEWA";
        }

        // Output
        System.out.println("\nOutput:");
        System.out.println("NPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
    
}
