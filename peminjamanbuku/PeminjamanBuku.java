package peminjamanbuku; 

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa{
    private String nim;
    private String nama;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public void pinjam(Buku s){
        daftarBuku.add(s);
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public ArrayList<Buku> getDaftarBuku(){
        return daftarBuku;
    }
}

class Buku {
    private String isbn;
    private String judul;

    public Buku(String isbn, String judul){
        this.isbn = isbn;
        this.judul = judul;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getJudul(){
        return judul;
    }
}

public class PeminjamanBuku {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa    : ");
        String nim = input.nextLine();
        System.out.print("Masukkan nama mahasiswa   : ");
        String nama = input.nextLine();
        Mahasiswa mhs = new Mahasiswa(nim, nama);

        System.out.print("Masukkan jumlah buku yang ingin dipinjam : ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++){
            System.out.println("Data buku ke-" + (i+1));
            System.out.print("Masukkan ISBN buku    : ");
            String isbn = input.nextLine();
            System.out.print("Masukkan judul buku   : ");
            String judul = input.nextLine();
            Buku buku = new Buku(isbn, judul);
            mhs.pinjam(buku);
        }

         System.out.println("======================================================");
         System.out.println("Nim    : " + mhs.getNim());
         System.out.println("Nama   : " + mhs.getNama());
         System.out.println("------------------------------------------------------");
         System.out.printf("| %-2s | %-14s | %-30s |\n", "No", "ISBN", "Judul");
         System.out.println("------------------------------------------------------");

         int nomor = 1;
         for (Buku s : mhs.getDaftarBuku()){
            System.out.printf("| %-2d | %-15s| %-30s |\n", nomor, s.getIsbn(), s.getJudul());
            nomor++;
         }
         System.out.println("------------------------------------------------------");
    }
}
