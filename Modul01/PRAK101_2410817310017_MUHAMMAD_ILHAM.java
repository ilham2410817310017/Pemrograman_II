package Modul01;

import java.util.Scanner;
import java.util.Locale;
public class PRAK101_2410817310017_MUHAMMAD_ILHAM{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();
        input.close();

        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        String bulanTeks = namaBulan[bulanLahir - 1];

        System.out.println("\nOutput\n");
        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\n",
                          namaLengkap, tempatLahir, tanggalLahir, bulanTeks, tahunLahir);
        System.out.printf(Locale.US, "Tinggi Badan %d cm dan Berat Badan %.2f kilogram\n",
                          tinggiBadan, beratBadan);
    }
}
