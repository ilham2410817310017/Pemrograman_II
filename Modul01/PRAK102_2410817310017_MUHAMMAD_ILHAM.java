package Modul01;
import java.util.Scanner;

public class PRAK102_2410817310017_MUHAMMAD_ILHAM {
	
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Input: ");
	        int startNumber = scanner.nextInt();

	        scanner.close();

	        int count = 0;
	        int currentNumber = startNumber;
	        
	        StringBuilder output = new StringBuilder();
	        while (count < 11) {
	            if (currentNumber % 5 == 0) {
	             
	                int result = (currentNumber / 5) - 1;
	                output.append(result);
	            } else {
	                
	                output.append(currentNumber);
	            }


	            if (count < 10) {
	                output.append(",");
	            }

	            currentNumber++;
	            count++;
	        }
	        System.out.println("\nOutput");
	        System.out.println(output.toString());
	    }
	}