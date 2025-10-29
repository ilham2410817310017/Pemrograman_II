package soal1modul4;
public class Main {

	public static void main(String[] args) {
		Input inputData = new Input();
		
		HewanPeliharaan Hewan = inputData.inputHewanPeliharaan();
		
		Hewan.display();
	}
}