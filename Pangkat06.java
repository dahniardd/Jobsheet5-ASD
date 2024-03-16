package Minggu5;

public class Pangkat06 {
    public int nilai, pangkat;

        public Pangkat06(int nilai, int pangkat) {
            this.nilai = nilai;
            this.pangkat = pangkat;
        }
        public int pangkatBF() {
            int hasil = 1;
            for (int i = 0; i < pangkat; i++) {
                hasil *= nilai;
            }
            return hasil;
        }
        public int pangkatDC() {
            if (pangkat == 0) {
                return 1;
            } else if (pangkat % 2 == 1) {
                return nilai * pangkatDC() * pangkatDC();
            } else {
                return pangkatDC() * pangkatDC();
            }
        }
            public static void main(String[] args) {
            int a = 2;
            int n = 5;
    
            Pangkat06 pangkatObjek = new Pangkat06(a, n);
    
            int hasilBF = pangkatObjek.pangkatBF();
            int hasilDC = pangkatObjek.pangkatDC();
    
            System.out.println("Pangkat " + a + " ^ " + n + " (BF): " + hasilBF);
            System.out.println("Pangkat " + a + " ^ " + n + " (DC): " + hasilDC);
        }
    }

