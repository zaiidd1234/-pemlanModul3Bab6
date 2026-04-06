import java.time.LocalDate;

public class Main6 {
    public static void main(String[] args) {

        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);

        MahasiswaFILKOM b = new MahasiswaFILKOM("165150300111100", 4.0, "B", "111", false, false);
        System.out.println(b);

        Pekerja c = new Pekerja(1000, LocalDate.of(2016, 3, 2), 4,
                "C", "111", true, true);
        System.out.println(c);

        Manager d = new Manager("HRD", 1000, LocalDate.of(2017, 2, 1),
                3, "D", "111", true, true);
                
        System.out.println(d);
    }
}