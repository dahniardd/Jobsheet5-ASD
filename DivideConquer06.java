package Minggu5;
import java.util.Scanner;
public class DivideConquer06 {
    public static int akarDivideConquer(int bilangan, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        int midSquare = mid * mid;

        if (midSquare == bilangan) {
            return mid;
        } else if (midSquare < bilangan) {
            return akarDivideConquer(bilangan, mid + 1, high);
        } else {
            return akarDivideConquer(bilangan, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int bilangan = 15;
        int akar = akarDivideConquer(bilangan, 1, bilangan);
        if (akar == -1) {
            System.out.println("Bilangan " + bilangan + " bukan kuadrat sempurna");
        } else {
            System.out.println("Akar dari " + bilangan + " adalah " + akar);
        }
    }
}
    
