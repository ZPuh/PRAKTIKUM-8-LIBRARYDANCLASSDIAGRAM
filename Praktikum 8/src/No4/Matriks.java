package No4;

import java.util.Scanner;

public class Matriks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Matriks matriks = new Matriks();
        matriks.generateMatrix(a, b);
    }
    private String generatedOutput;

    public void generateMatrix(int a, int b) {
        StringBuilder output = new StringBuilder();
        int c = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                output.append((c++)).append("\t");
            }
            output.append("\n");
        }
        generatedOutput = output.toString();
    }

    public String getGeneratedOutput() {
        return generatedOutput;
    }
}
