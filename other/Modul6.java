package other;
// public class Mobil {
//     private String noPlat;
//     private String warna;
//     private String manufaktur;
//     private double kecepatan; 
//     private double waktu;    

//     public void setNoPlat(String s) {
//         noPlat = s;
//     }

//     public void setWarna(String s) {
//         warna = s;
//     }

//     public void setManufaktur(String s) {
//         manufaktur = s;
//     }

//     private double ubahKecepatan(double kmh) {
//         return kmh / 3.6;
//     }

//     private double ubahSekon(double jam) {
//         return jam * 3600;
//     }

//     public void setKecepatan(double kmh) {
//         this.kecepatan = ubahKecepatan(kmh);
//     }

//     public void setWaktu(double jam) {
//         this.waktu = ubahSekon(jam);
//     }

//     public double hitungJarak() {
//         return kecepatan * waktu;
//     }

//     public void displayMessage() {
//         System.out.println("Mobil Anda Adalah bermerek " + manufaktur);
//         System.out.println("mempunyai nomor plat " + noPlat);
//         System.out.println("serta memiliki warna " + warna);
//         System.out.printf("dan mampu menempuh kecepatan %.2f m/s%n", kecepatan);
//         System.out.println("Waktu tempuh: " + waktu + " sekon");
//         double jarakKm = hitungJarak() / 1000;
//         System.out.printf("Jarak yang dapat ditempuh: %.2f km%n", jarakKm);
//     }
// }

// public class BukuTulis {
//     private int jumlahLembar;
//     private double halPerHari;

//     public void setJumlahLembar(int n) {
//         jumlahLembar = n;
//     }

//     public void setHalPerHari(double h) {
//         halPerHari = h;
//     }

//     private int hitungTotalHal() {
//         return jumlahLembar * 2;
//     }

//     public double hitungLamaHabis() {
//         double totalHal = hitungTotalHal();
//         return totalHal / halPerHari;
//     }

//     public void displayInfo() {
//         System.out.println("=== Informasi Buku ===");
//         System.out.println("Jumlah Lembar : " + jumlahLembar);
//         System.out.println("Total Halaman : " + hitungTotalHal() + " (Bolak-balik)");
//         System.out.println("Menulis per hari: " + halPerHari + " halaman (setara 100 kata)");
//         System.out.println("----------------------");
//         System.out.println("Buku akan habis dalam: " + (int)hitungLamaHabis() + " hari");
//     }
// }

// public class MainBuku {
//     public static void main(String[] args) {
//         BukuTulis bukuSaya = new BukuTulis();
//         bukuSaya.setJumlahLembar(50); 
//         bukuSaya.setHalPerHari(0.5); 
//         bukuSaya.displayInfo();
//     }
// }