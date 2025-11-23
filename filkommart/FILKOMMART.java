package filkommart;
import java.util.Scanner;

class Barang {
    String nama;
    double harga;

    Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

class ItemBelanja {
    String namaBarang;
    int jumlah;
    double hargaSatuan;
    double subtotal;

    ItemBelanja(String nama, int jumlah, double harga) {
        this.namaBarang = nama;
        this.jumlah = jumlah;
        this.hargaSatuan = harga;
        this.subtotal = jumlah * harga;
    }
}

public class FILKOMMART {
    static double cariHarga(String nama, Barang[] daftarBarang) {
        for (int i = 0; i < daftarBarang.length; i++) {
            if (daftarBarang[i].nama.equalsIgnoreCase(nama)) {
                return daftarBarang[i].harga;
            }
        }
        return 0;
    }

    static void cetakStruk(ItemBelanja[] items, int jumlahItem, double totalBayar) {
        System.out.printf("%34s\n", "255150400111020 Chelsea Valencia");
        System.out.println();
        System.out.printf("%23s\n", "FILKOM-MART");
        System.out.printf("%26s\n", "JL VETERAN MALANG");
        System.out.printf("%26s\n", "TELP. 0341-577911");
        System.out.println("20 September 2021                 19.50");
        System.out.println("Receipt Number  : 150001");
        System.out.println("Order ID        : FM001");
        System.out.println("==============================================");

        for (int i = 0; i < jumlahItem; i++) {
            if (items[i].jumlah > 0) {
                System.out.printf("%-15s x %2d = Rp%,.0f\n",
                        items[i].namaBarang,
                        items[i].jumlah,
                        items[i].subtotal);
            } else {
                System.out.println("0");
            }
        }

        System.out.println("==============================================");
        System.out.printf("Total Bayar          : Rp%,.0f\n", totalBayar);
        System.out.println("Terima kasih telah berbelanja di Filkom Mart!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Barang[] daftarBarang = {
                new Barang("Beras", 55000),
                new Barang("Gula", 18000),
                new Barang("Minyak Goreng", 35000),
                new Barang("Sabun", 15000),
                new Barang("Telur", 2500)
        };

        System.out.println("=== Selamat Datang di Filkom Mart ===");
        System.out.print("Jumlah barang yang dibeli: ");
        int jumlahJenisBarang = input.nextInt();
        input.nextLine();

        ItemBelanja[] keranjang = new ItemBelanja[jumlahJenisBarang];
        double totalBayar = 0;

        for (int i = 0; i < jumlahJenisBarang; i++) {
            System.out.print("Nama Barang " + (i + 1) + " : ");
            String namaBarang = input.nextLine();

            System.out.print("Jumlah Barang " + (i + 1) + " : ");
            int jumlah = input.nextInt();
            input.nextLine();

            double harga = cariHarga(namaBarang, daftarBarang);

            keranjang[i] = new ItemBelanja(namaBarang, jumlah, harga);
            totalBayar += keranjang[i].subtotal;
        }
        cetakStruk(keranjang, jumlahJenisBarang, totalBayar);
        input.close();
    }
}

