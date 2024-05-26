package No4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        try {
            // Baca input dari file input.txt dan output.txt
            Scanner inputScanner = new Scanner(new File("src/No4/input.txt"));
            Scanner outputScanner = new Scanner(new File("src/No4/output.txt"));

            // Baca nilai a dan b dari input.txt
            int a = inputScanner.nextInt();
            int b = inputScanner.nextInt();

            // Jalankan program yang akan diuji
            Matriks matriks = new Matriks();
            
            matriks.generateMatrix(a, b);

            // Baca output file output.txt
            StringBuilder expectedOutput = new StringBuilder();
            while (outputScanner.hasNextLine()) {
                expectedOutput.append(outputScanner.nextLine()).append("\n");
            }

            // Bandingkan output yang dihasilkan dengan output yang seharusnya
            if (matriks.getGeneratedOutput().equalsIgnoreCase(expectedOutput.toString())) {
                System.out.println("RESULT : ");
                System.out.println(matriks.getGeneratedOutput());
                System.out.println(expectedOutput.toString());
                System.out.println("VALID : Output program sudah sesuai dengan yang seharusnya.");
            } else {
                System.out.println("RESULT : ");
                System.out.println(matriks.getGeneratedOutput());
                System.out.println(expectedOutput.toString());
                System.out.println("INVALID : Output program tidak sama dengan yang seharusnya.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Ditemukan Error Program: " + ex.getMessage());
        }
    }
}
