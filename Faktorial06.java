package Minggu5;
import java.util.Scanner;
public class Faktorial06{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input nilai n
            System.out.print("Masukkan nilai n: ");
            int n = scanner.nextInt();
    
            // **Menghitung waktu eksekusi TotalBF()**
            long startTimeBF = System.nanoTime();
            int hasilBF = FaktorialBF(n);
            long endTimeBF = System.nanoTime();
            long waktuEksekusiBF = endTimeBF - startTimeBF;
    
            // **Menghitung waktu eksekusi TotalDC()**
            long startTimeDC = System.nanoTime();
            int hasilDC = FaktorialBF(n-1);
            long endTimeDC = System.nanoTime();
            long waktuEksekusiDC = endTimeDC - startTimeDC;
    
            // Menampilkan hasil
            System.out.println("Hasil TotalBF(): " + hasilBF);
            System.out.println("Waktu Eksekusi TotalBF(): " + waktuEksekusiBF + " nanoseconds");
            System.out.println();
            System.out.println("Hasil TotalDC(): " + hasilDC);
            System.out.println("Waktu Eksekusi TotalDC(): " + waktuEksekusiDC + " nanoseconds");
        }
    
        public static int FaktorialBF(int n) {
            int hasil = 1;
            for (int i = 1; i <= n; i++) {
                hasil *= i;
            }
            return hasil;
        }
    
        public static int FakDC(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * FaktorialBF(n - 1);
            }
        }
    }
    

