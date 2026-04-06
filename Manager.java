import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jk, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jk, menikah);
        this.departemen = departemen;
    }

    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * gaji);
    }

    public String toString() {
        return super.toString() + "\nDepartemen      : " + departemen;
    }
}