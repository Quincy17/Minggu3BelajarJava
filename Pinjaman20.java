import java.util.Scanner;
public class Pinjaman20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tabungan_awal, lama_menabung;
        double tabungan_akhir, bunga, prosentase_bunga=0.02;
        System.out.println("Masukkan tabungan awal anda: ");
        tabungan_awal= input.nextInt();
        System.out.println("Berapa lama anda menabung (dalam tahun): ");
        lama_menabung= input.nextInt();
        bunga=lama_menabung*prosentase_bunga*tabungan_awal;
        tabungan_akhir=bunga+tabungan_awal;
        System.out.println("Jumlah Tabungan Akhir Anda adalah: " + tabungan_akhir);
    }
}