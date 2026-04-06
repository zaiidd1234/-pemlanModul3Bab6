public class Manusia {
    protected String nama;
    protected String nik;
    protected boolean jenisKelamin;
    protected boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) 
                return 25;
            else 
                return 20;
        }
        return 15;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "Nama            : " + nama + "\nNik             : " + nik + "\nJenis Kelamin   : " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\nPendapatan      : " + getPendapatan();
    }
}