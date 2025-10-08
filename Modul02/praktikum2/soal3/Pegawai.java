package praktikum2.soal3; 

      //Pada baris ini terjadi kesalahan karna nama class yang digunakan tidak sesuai 
      //public class Employee { 
public class Pegawai {
       public String nama; 
     	//pada baris ini terjadi error karena tipe data untuk asal adalah char, yang hanya bisa menampung satu karakter.
     	//sedangkan di Soal3Main, variabel ini diisi dengan String "Kingdom of Orvel".
     	//public char asal;
        public String asal;
     	public String jabatan;
     	public int umur;
     	
     	public String getNama() {
     		return nama;
     	}
     	public String getAsal() {
     		return asal;
     	}
     	//pada baris ini terjadi error karena metode setJabatan tidak memiliki parameter untuk menerima input.
     	//sehingga variabel j tidak terdefinisi.
     	//public void setJabatan() {
     	public void setJabatan(String j) {
     		this.jabatan = j;		
     	}
     }
