package soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> semuaDadu = new LinkedList<>();
        System.out.print("Masukkan Jumlah Dadu: ");
        int jumlahDadu = scanner.nextInt();
        int totalNilai = 0;
        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            semuaDadu.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
            totalNilai += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan: " + totalNilai);
        scanner.close();
    }
}