package soal2;
import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggal;
        this.bulanKemerdekaan = bulan;
        this.tahunKemerdekaan = tahun;
    }
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    public void tampilkanInfo(HashMap<Integer, String> daftarBulan) {
        String gelarPemimpin;

        switch (jenisKepemimpinan.toLowerCase()) {
            case "monarki":
                gelarPemimpin = "Raja";
                break;
            case "presiden":
                gelarPemimpin = "Presiden";
                break;
            case "perdana menteri":
                gelarPemimpin = "Perdana Menteri";
                break;
            default:
                gelarPemimpin = jenisKepemimpinan;
                break;
        }
        System.out.println("Negara " + this.nama + " mempunyai " + gelarPemimpin + " bernama " + this.namaPemimpin);
        if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal "
                    + this.tanggalKemerdekaan
                    + " " + daftarBulan.get(this.bulanKemerdekaan)
                    + " " + this.tahunKemerdekaan);
        }
    }
}