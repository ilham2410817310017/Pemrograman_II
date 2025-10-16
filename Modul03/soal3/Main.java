package soal3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            
            pilihan = Integer.parseInt(scanner.nextLine()); 
            jalankanPilihan(pilihan);
        } while (pilihan != 0);
        scanner.close();
    }
    public static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
        System.out.println("3. Cari Mahasiswa berdasarkan NIM");
        System.out.println("4. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }
    public static void jalankanPilihan(int pilihan) {
        switch (pilihan) {
            case 1:
                tambahMahasiswa();
                break;
            case 2:
                hapusMahasiswa();
                break;
            case 3:
                cariMahasiswa();
                break;
            case 4:
                tampilkanDaftarMahasiswa();
                break;
            case 0:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
    public static void tambahMahasiswa() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = scanner.nextLine();

        boolean nimAda = false;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                nimAda = true;
                break;
            }
        }
        if (nimAda) {
            System.out.println("NIM sudah terdaftar. Mahasiswa gagal ditambahkan.");
        } else {
            daftarMahasiswa.add(new Mahasiswa(nama, nim));
            System.out.println("Mahasiswa " + nama + " ditambahkan.");
        }
    }
    public static void hapusMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nimHapus = scanner.nextLine();
        
        boolean berhasilDihapus = daftarMahasiswa.removeIf(mhs -> mhs.getNim().equals(nimHapus));
        if (berhasilDihapus) {
            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
        }
    }
    public static void cariMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String nimCari = scanner.nextLine();
        Mahasiswa ditemukan = null;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nimCari)) {
                ditemukan = mhs;
                break;
            }
        }
        if (ditemukan != null) {
            System.out.println("Mahasiswa ditemukan:");
            System.out.println(ditemukan);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }

    public static void tampilkanDaftarMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            for (Mahasiswa mhs : daftarMahasiswa) {
                System.out.println(mhs);
            }
        }
    }
}