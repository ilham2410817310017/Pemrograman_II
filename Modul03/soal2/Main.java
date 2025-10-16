package soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();
        HashMap<Integer, String> daftarBulan = new HashMap<>();
        daftarBulan.put(1, "Januari");
        daftarBulan.put(2, "Februari");
        daftarBulan.put(3, "Maret");
        daftarBulan.put(4, "April");
        daftarBulan.put(5, "Mei");
        daftarBulan.put(6, "Juni");
        daftarBulan.put(7, "Juli");
        daftarBulan.put(8, "Agustus");
        daftarBulan.put(9, "September");
        daftarBulan.put(10, "Oktober");
        daftarBulan.put(11, "November");
        daftarBulan.put(12, "Desember");

        int jumlahNegara = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin);
                daftarNegara.add(negara);
            } 
            else {
                int tanggal = Integer.parseInt(scanner.nextLine());
                int bulan = Integer.parseInt(scanner.nextLine());
                int tahun = Integer.parseInt(scanner.nextLine());

                Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun);
                daftarNegara.add(negara);
            }
        }
        for (Negara negara : daftarNegara) {
            negara.tampilkanInfo(daftarBulan);
            System.out.println(); 
        }
        scanner.close();
    }
}