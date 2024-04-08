package listing8_2;

import java.time.*;
import listing8_1.Pair;

/**
 * @version 1.02 2015-06-21
 * @author Cay Horstmann
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9), // G. Hopper
                LocalDate.of(1815, 12, 10), // A. Lovelace
                LocalDate.of(1903, 12, 3), // J. von Neumann
                LocalDate.of(1910, 6, 22), // K. Zuse
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        // LocalDate[] meng-imsplements Comparable
        System.out.println("min = " + mm.getFirst());
        // min adalah jumlah detik terkecil sejak patokan waktu
        System.out.println("max = " + mm.getSecond());
    }
}
