import java.util.Scanner;
class Akademik {
    static double hitungNilaiAkhir(int tugas, int uts, int uas) {
        double hasil = 0.3 * tugas + 0.3 * uts + 0.4 * uas;
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("       SISTEM PENGOLAHAN NILAI MAHASISWA");
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        String[] npm = new String[jumlah];
        String[] nama = new String[jumlah];
        int[] tugas = new int[jumlah];
        int[] uts = new int[jumlah];
        int[] uas = new int[jumlah];
        double[] akhir = new double[jumlah];
        String[] huruf = new String[jumlah];
        String[] status = new String[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println();
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            System.out.println("---------------------------------------------");
            System.out.print("NPM           : ");
            npm[i] = input.next();
            System.out.print("Nama          : ");
            nama[i] = input.next();
            System.out.print("Nilai Tugas   : ");
            tugas[i] = input.nextInt();
            while (tugas[i] < 0 || tugas[i] > 100) {
                System.out.println("Nilai tidak valid! Harus 0 - 100");
                System.out.print("Nilai Tugas   : ");
                tugas[i] = input.nextInt();
            }         
            System.out.print("Nilai UTS     : ");
            uts[i] = input.nextInt();
            while (uts[i] < 0 || uts[i] > 100) {
                System.out.println("Nilai tidak valid! Harus 0 - 100");
                System.out.print("Nilai UTS     : ");
                uts[i] = input.nextInt();
            }
            System.out.print("Nilai UAS     : ");
            uas[i] = input.nextInt();
            while (uas[i] < 0 || uas[i] > 100) {
                System.out.println("Nilai tidak valid! Harus 0 - 100");
                System.out.print("Nilai UAS     : ");
                uas[i] = input.nextInt();
            }
   
            akhir[i] = hitungNilaiAkhir(tugas[i], uts[i], uas[i]);            
            if (akhir[i] >= 80) {
            huruf[i] = "A";
   } else if (akhir[i] >= 70) {
                huruf[i] = "B";
            } else if (akhir[i] >= 60) {
                huruf[i] = "C";
            } else if (akhir[i] >= 50) {
                huruf[i] = "D";
            } else {
                huruf[i] = "E";
            }   
            if (akhir[i] >= 60) {
                status[i] = "LULUS";
            } else {
                status[i] = "TIDAK LULUS";
            }
        }
        System.out.println();
        System.out.println("============================================================");
        System.out.println("                  DAFTAR NILAI MAHASISWA");
        System.out.println("============================================================");
        System.out.println("No  NPM         Nama      Tugas UTS UAS Akhir Huruf Status");
        System.out.println("------------------------------------------------------------");
        int lulus = 0;
        double tertinggi = akhir[0];
        double terendah = akhir[0];
        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-3d %-11s %-9s %-5d %-3d %-3d %-5.1f %-5s %s\n",
                    (i + 1), npm[i], nama[i], tugas[i], uts[i], uas[i],
                    akhir[i], huruf[i], status[i]);
            if (akhir[i] >= 60) {
                lulus = lulus + 1;
            }
            if (akhir[i] > tertinggi) {
                tertinggi = akhir[i];
            }
            if (akhir[i] < terendah) {
                terendah = akhir[i];
            }
            total = total + akhir[i];
        }
        System.out.println("============================================================");
        
        double rata = total / jumlah;
        System.out.println();
        System.out.println("STATISTIK NILAI");
        System.out.println("----------------------------------------");
        System.out.println("Jumlah Mahasiswa       : " + jumlah);
        System.out.println("Jumlah Mahasiswa Lulus : " + lulus);
        System.out.println("Jumlah Tidak Lulus     : " + (jumlah - lulus));
        System.out.println("Nilai Tertinggi        : " + tertinggi);
        System.out.println("Nilai Terendah         : " + terendah);
        System.out.printf("Rata-rata Kelas        : %.2f\n", rata);
        System.out.println("============================================================");
    }
}
