package Minggu5;
import java.util.Scanner;
public class BruteForceAkar06 {
    public static int akarBruteForce(int bilangan) {
        for (int i = 1; i <= bilangan; i++) {
            if (i * i <= bilangan) {
                return i;
    }
            }
                return -1;
        }
        
    public static void main(String[] args) {
        int bilangan = 15;
        int akar = akarBruteForce(bilangan);
            if (akar == -1) {
                System.out.println("Bilangan " + bilangan + " bukan kuadrat sempurna");
            } else {
                System.out.println("Akar dari " + bilangan + " adalah " + akar);
            }
        }
    }
        

