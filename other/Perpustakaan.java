package other;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Penulis {
    private String nama;

    public Penulis(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}

class ganti {
    private String judul;
    private List<Penulis> penulis;

    public ganti(String judul, Penulis... penulis) {
        this.judul = judul;
        this.penulis = new ArrayList<>(Arrays.asList(penulis));
    }

    public void display() {
        System.out.println(" - Judul: " + this.judul);

        List<String> namaPenulis = new ArrayList<>();
        for (Penulis p : this.penulis) {
            namaPenulis.add(p.getNama());
        }
        System.out.println("   Penulis: " + String.join(", ", namaPenulis));
    }
}

class Kategori {
    private String nama;
    private List<Buku> daftarBuku;

    public Kategori(String nama) {
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
    }

    public void addBuku(Buku buku) {
        this.daftarBuku.add(buku);
    }

    public void display() {
        System.out.println();
        System.out.println("Kategori: " + this.nama);
        System.out.println("----------------------------------------------------");

        if (daftarBuku.isEmpty()) {
            System.out.println(" (Tidak ada buku dalam kategori ini)");
        } else {
            for (Buku buku : this.daftarBuku) {
                buku.display();
                System.out.println();
            }
        }
    }
}

public class Perpustakaan {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("    KOLEKSI BUKU PERPUSTAKAAN KAMPUS X");
        System.out.println("===========================================");

        Kategori teknologi = new Kategori("Teknologi");
        Kategori filsafat = new Kategori("Filsafat");
        Kategori sejarah = new Kategori("Sejarah");
        Kategori agama = new Kategori("Agama");
        Kategori psikologi = new Kategori("Psikologi");
        Kategori politik = new Kategori("Politik");
        Kategori fiksi = new Kategori("Fiksi");

        teknologi.addBuku(new Buku("Clean Code", new Penulis("Robert C. Martin")));
        teknologi.addBuku(new Buku("Introduction to Algorithms",
                new Penulis("Thomas H. Cormen"), new Penulis("Charles E. Leiserson"), new Penulis("Ronald L. Rivest")));
        teknologi.addBuku(new Buku("Design Patterns",
                new Penulis("Erich Gamma"), new Penulis("Richard Helm"), new Penulis("Ralph Johnson"), new Penulis("John Vlissides")));
        teknologi.addBuku(new Buku("Artificial Intelligence: A Modern Approach",
                new Penulis("Stuart Russell"), new Penulis("Peter Norvig")));
        teknologi.addBuku(new Buku("The Pragmatic Programmer",
                new Penulis("Andrew Hunt"), new Penulis("David Thomas")));

        filsafat.addBuku(new Buku("Dunia Sophie", new Penulis("Jostein Gaarder")));
        filsafat.addBuku(new Buku("Meditations", new Penulis("Marcus Aurelius")));
        filsafat.addBuku(new Buku("Thus Spoke Zarathustra", new Penulis("Friedrich Nietzsche")));
        filsafat.addBuku(new Buku("The Republic", new Penulis("Plato")));
        filsafat.addBuku(new Buku("Filosofi Teras", new Penulis("Henry Manampiring")));


        Penulis yuval = new Penulis("Yuval Noah Harari");
        sejarah.addBuku(new Buku("Sapiens: A Brief History of Humankind", yuval));
        sejarah.addBuku(new Buku("Guns, Germs, and Steel", new Penulis("Jared Diamond")));
        sejarah.addBuku(new Buku("Sejarah Indonesia Modern", new Penulis("M.C. Ricklefs")));
        sejarah.addBuku(new Buku("Catatan Seorang Demonstran", new Penulis("Soe Hok Gie")));
        sejarah.addBuku(new Buku("The History of the Peloponnesian War", new Penulis("Thucydides")));

        agama.addBuku(new Buku("Tafsir Al-Mishbah", new Penulis("Quraish Shihab")));
        agama.addBuku(new Buku("Mere Christianity", new Penulis("C.S. Lewis")));
        agama.addBuku(new Buku("Bhagavad Gita", new Penulis("Vyasa")));
        agama.addBuku(new Buku("The Case for Christ", new Penulis("Lee Strobel")));
        agama.addBuku(new Buku("Mizanul Muslimin", new Penulis("KH. Hasyim Asy'ari")));

        psikologi.addBuku(new Buku("Thinking, Fast and Slow", new Penulis("Daniel Kahneman")));
        psikologi.addBuku(new Buku("Man's Search for Meaning", new Penulis("Viktor Frankl")));
        psikologi.addBuku(new Buku("Atomic Habits", new Penulis("James Clear")));
        psikologi.addBuku(new Buku("Influence: The Psychology of Persuasion", new Penulis("Robert B. Cialdini")));
        psikologi.addBuku(new Buku("The Interpretation of Dreams", new Penulis("Sigmund Freud")));

        politik.addBuku(new Buku("The Prince", new Penulis("Niccolò Machiavelli")));
        politik.addBuku(new Buku("Das Kapital", new Penulis("Karl Marx")));
        politik.addBuku(new Buku("1984", new Penulis("George Orwell")));
        politik.addBuku(new Buku("Negara Paripurna", new Penulis("Yudi Latif")));
        politik.addBuku(new Buku("Why Nations Fail", new Penulis("Daron Acemoglu"), new Penulis("James A. Robinson")));

        fiksi.addBuku(new Buku("Laskar Pelangi", new Penulis("Andrea Hirata")));
        fiksi.addBuku(new Buku("Bumi Manusia", new Penulis("Pramoedya Ananta Toer")));
        fiksi.addBuku(new Buku("The Lord of the Rings", new Penulis("J.R.R. Tolkien")));
        fiksi.addBuku(new Buku("Harry Potter and the Sorcerer's Stone", new Penulis("J.K. Rowling")));
        fiksi.addBuku(new Buku("Dune", new Penulis("Frank Herbert")));

        teknologi.display();
        filsafat.display();
        sejarah.display();
        agama.display();
        psikologi.display();
        politik.display();
        fiksi.display();
    }
}
