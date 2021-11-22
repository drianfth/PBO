public class Mahasiswa {
    String nama;
    String nrp;
    float nilai;

    public Mahasiswa(String nama, String nrp, float nilai) {
        this.nama = nama;
        this.nrp = nrp;
        this.nilai = nilai;
    }

    public String getNrp() {
        return nrp;
    }

    public float getNilai() {
        return nilai;
    }

    public String toString() {
        return ("Nama " + nama + "\tNRP " + nrp + "\t\tNilai : " + nilai + "\n");
    }
}
