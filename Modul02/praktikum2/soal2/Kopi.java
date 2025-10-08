package praktikum2.soal2;

public class Kopi {
	String namaKopi;
	String ukuran;
	double harga;
	String pembeli;
	
		void info() {
			System.out.println("Nama Kopi: " + this.namaKopi);
			System.out.println("Ukuran: " + this.ukuran);
			System.out.println("Harga : Rp." + this.harga);		
	}
		void setPembeli(String pembeli) {
			this.pembeli = pembeli;
		}
		
		String getPembeli() {
			return this.pembeli;
		}
		double getPajak() {
			return this.harga * 0.11;
		}
}	
