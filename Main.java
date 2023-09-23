// Import paket "encapsulation"
package encapsulation;

// Mendefinisikan kelas "Pasien"
class Pasien {
    // Deklarasi atribut atau variabel kelas "Pasien"
    String nama, penyakit;
    int umur;

    // Getter nama pasien, mengembalikan nilai atribut "nama"
    public String getNama() {
        return nama;
    }

    // Setter nama pasien, mengatur nilai atribut "nama"
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    // Getter nama penyakit, mengembalikan nilai atribut "penyakit"
    public String getPenyakit() {
        return penyakit;
    }

    // Setter nama penyakit, mengatur nilai atribut "penyakit"
    public void setPenyakit(String newPenyakit) {
        this.penyakit = newPenyakit;
    }

    // Getter umur, mengembalikan nilai atribut "umur"
    public int getUmur() {
        return umur;
    }

    // Setter umur, mengatur nilai atribut "umur"
    public void setUmur(int newUmur) {
        this.umur = newUmur;
    }
}

// Kelas utama "Main"
class Main {
    // Metode utama (main method)
    public static void main(String args[]) {
        // Menginisialisasi objek "Pasien" dengan nama "Obj"
        Pasien Obj = new Pasien();

        // Mengatur nilai atribut nama, penyakit, dan umur pada objek "Obj"
        Obj.setNama("Galih Anggoro Prasetya.");
        Obj.setPenyakit("Tidak Ada Penyakit.");
        Obj.setUmur(19);

        // Mengambil dan mencetak nilai atribut nama, penyakit, dan umur dari objek "Obj"
        System.out.println(Obj.getNama());
        System.out.println(Obj.getPenyakit());
        System.out.println(Obj.getUmur());
    }
}
