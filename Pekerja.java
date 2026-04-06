import java.time.LocalDate;

public class Pekerja extends Manusia {
    protected double gaji;
    protected LocalDate tahunMasuk;
    protected int jumlahAnak;

    public Pekerja(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jk, boolean menikah) {
        super(nama, nik, jk, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lama = LocalDate.now().getYear() - tahunMasuk.getYear();

        if (lama <= 5) 
            return 0.05 * gaji;
        
        else if (lama <= 10) 
            return 0.10 * gaji;
        
        else 
            return 0.15 * gaji;
    }

    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

    public String toString() {
        System.out.println("=======================================");
        return super.toString() + "\nTahun masuk     : " + tahunMasuk + "\nJumlah anak     : " + jumlahAnak + "\nGaji            : " + gaji;
    }
}