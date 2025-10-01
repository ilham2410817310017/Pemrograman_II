package Modul01;
import java.util.Scanner;

public class PRAK104_2410817310017_MUHAMMAD_ILHAM {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Input");
	        System.out.print("Tangan Abu: ");
	        String abuPilihan = scanner.nextLine();
	        String[] abuRonde = abuPilihan.split(" ");

	        System.out.print("Tangan Bagas: ");
	        String bagasPilihan = scanner.nextLine();
	        String[] bagasRonde = bagasPilihan.split(" ");

	        scanner.close();

	        int abuPoin = 0;
	        int bagasPoin = 0;

	        for (int i = 0; i < 3; i++) {
	            char abu = abuRonde[i].charAt(0);
	            char bagas = bagasRonde[i].charAt(0);

	            if (abu == bagas) {
	            } else if ((abu=='B'&&bagas=='G') ||
	                       (abu=='G'&&bagas=='K') ||
	                       (abu=='K'&&bagas=='B')) {
	                abuPoin++;
	            } else {
	                bagasPoin++;
	            }
	        }
	        
	        System.out.println("\nOutput");
	        if (abuPoin > bagasPoin) {
	            System.out.println("Abu");
	        } else if (bagasPoin > abuPoin) {
	            System.out.println("Bagas");
	        } else {
	            System.out.println("Seri");
	        }
	    }
	}