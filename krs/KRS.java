package krs;
import java.util.ArrayList;
import java.util.Scanner;


class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() { 
        return kode; 
    }

    public String getNama() {
         return nama; 
    }
    public int getSks() {
         return sks; 
    }
}

class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<MataKuliah> daftarMK = new ArrayList<>();
    private final int BATAS_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public boolean tambahMataKuliah(MataKuliah mk) {
        if (hitungTotalSks() + mk.getSks() > BATAS_SKS) {
            return false;
        }
        daftarMK.add(mk);
        return true;
    }

    public int hitungTotalSks() {
        int total = 0;
        for (MataKuliah mk : daftarMK) {
            total += mk.getSks();
        }
        return total;
    }

    public void cetakKRS() {
        System.out.println("============================================================");
        System.out.println("                    KARTU RENCANA STUDI");
        System.out.println("============================================================");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println();

        System.out.printf("%-3s | %-7s | %-30s | %-3s\n",
                          "No", "Kode", "Nama Mata Kuliah", "SKS");
        System.out.println("------------------------------------------------------------");

        int no = 1;
        for (MataKuliah mk : daftarMK) {
            System.out.printf("%-3d | %-7s | %-30s | %-3d\n",
                              no, mk.getKode(), mk.getNama(), mk.getSks());
            no++;
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%s %38d\n", "Total SKS: ", hitungTotalSks());
        System.out.println();
        
        System.out.printf("%55s\n", "Mengetahui,");
        System.out.println();  // baris kosong
        System.out.printf("%55s\n", "(TTD Kepala KPS)");
        System.out.println();  // baris kosong
        System.out.printf("%55s\n", "Kepala KPS");
        System.out.println();
        System.out.printf("%50s %s\n", "NIM  :", nim);
        System.out.printf("%50s %s\n", "Nama :", nama);

        System.out.println("============================================================");
    }
}

public class KRS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM  : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama);

        while (true) {
            System.out.print("\nTambahkan mata kuliah? (iya/tidak): ");
            String pilih = input.nextLine();
            if (pilih.equalsIgnoreCase("tidak")) break;

            System.out.print("Kode MK   : ");
            String kode = input.nextLine();

            System.out.print("Nama MK   : ");
            String namaMK = input.nextLine();

            System.out.print("SKS MK    : ");
            int sks = Integer.parseInt(input.nextLine());

            MataKuliah mk = new MataKuliah(kode, namaMK, sks);

            if (!mhs.tambahMataKuliah(mk)) {
                System.out.println("SKS melebihi batas 24. MK tidak ditambahkan.");
            } else {
                System.out.println("MK berhasil ditambahkan.");
                System.out.println("Total sks mk yang telah ditambahkan : " + mhs.hitungTotalSks());
            }
        }

        System.out.println();
        mhs.cetakKRS();
    }
}


