package soal1modul4;
import java.util.Scanner;

public class Input {

	public HewanPeliharaan inputHewanPeliharaan(){
		Scanner scanner = new Scanner(System.in);
		String inputNama;
		String inputRas;
		
		
	System.out.print("Nama: ");
	inputNama = scanner.nextLine();
	
	System.out.print("Ras: ");
	inputRas = scanner.nextLine();
	scanner.close();
	
	return new HewanPeliharaan(inputRas,inputNama);
	}
}
