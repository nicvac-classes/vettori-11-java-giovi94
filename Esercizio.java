//LEGGERE LE ISTRUZIONI NEL FILE README.md
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Inserisci il numero di cifre (N): ");
        int N = scanner.nextInt();
        int[] U = new int[N];
        for (int i = 0; i < N; i++) {
            int num;
            do {
                System.out.print("Inserisci il numero positivo per U[" + i + "]: ");
                num = scanner.nextInt();
                if (num < 0) {
                    System.out.println("Numero negativo non valido! Riprova.");
                }
            } while (num < 0);
            U[i] = num;
        }
        int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            R[i] = random.nextInt(11); 
        }
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = random.nextInt(6) + 3; 
        }
        double[] M = new double[N];
        for (int i = 0; i < N; i++) {
            M[i] = (U[i] + R[i] + S[i]) / 3.0;
        }
        System.out.println("\nContenuto del vettore M (media di U, R e S):");
        for (int i = 0; i < N; i++) {
            System.out.println("M[" + i + "] = " + M[i]);
        }
        System.out.print("\nInserisci un numero T: ");
        int T = scanner.nextInt();
        System.out.println("\nCoppie che sommano a " + T + ":");
        boolean found = false;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (U[i] + U[j] == T) {
                    System.out.println("U[" + i + "] = " + U[i] + " e U[" + j + "] = " + U[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Nessuna coppia trovata.");
        }
        
        scanner.close();
    }
}
