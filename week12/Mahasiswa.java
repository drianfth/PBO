public class Mahasiswa {
    String nrp;
    String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public String toString() {
        return ("Nama " + nama + " NRP " + nrp);
    }
}
