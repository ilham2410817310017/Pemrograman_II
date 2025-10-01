package Modul01;
import java.util.Scanner;

public class PRAK103_2410817310017_MUHAMMAD_ILHAM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        int n = scanner.nextInt();
        int bilanganAwal = scanner.nextInt();

        scanner.close();

        int count = 0;
        int currentNumber = bilanganAwal;

        StringBuilder output = new StringBuilder();

        do {
            if (currentNumber % 2 != 0) {
                output.append(currentNumber);
                
                if (count < n - 1) {
                    output.append(", ");
                }
                
                count++;
            }
            currentNumber++;

        } while (count < n); 

        System.out.println("\nOutput");
        System.out.println(output.toString());
    }
}

