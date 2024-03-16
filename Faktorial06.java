package Minggu5;

public class Faktorial06{
    public int nilai;
    // Faktorial menggunakan Rekursi
  public static int faktorialRekursi(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * faktorialRekursi(n - 1);
    }
  }

    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        }
        else 
        {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
