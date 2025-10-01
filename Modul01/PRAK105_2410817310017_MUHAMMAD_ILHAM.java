package Modul01;
import java.util.Locale; 
import java.util.Scanner;

public class PRAK105_2410817310017_MUHAMMAD_ILHAM {
	public static final double PHI = 3.14 ;	  
	public static void main(String[] args) { 
		  Scanner input = new Scanner(System.in).useLocale(Locale.US); 	   
		  double r, t; 
	   	  do { 
	            System.out.println("Input");
		  		System.out.print("Masukkan jari-jari: "); 
	            r = input.nextDouble(); 
	            if (r <= 0) { 
	                System.out.println("Tabung tidak terdefinisi\n"); 
	            }
	            
	   	  } while (r <= 0); 
		  do { 
			  System.out.print("Masukkan tinggi: "); 
			  t = input.nextDouble(); 
			  if (t <= 0) { 
		  System.out.println("Tabung tidak terdefinisi\n"); 
			  }
			  
		  } while (t <= 0);		  
		  double volume = PHI * r * r * t;		  
		  System.out.println("\nOutput");
		  System.out.printf(Locale.US, "Volume tabung dengan jari-jari %.1f cm dan \n", r); 
		  System.out.printf(Locale.US, "tinggi %.1f cm adalah %.3f m3\n", t, volume); 
		  input.close(); 
		  } 
	}