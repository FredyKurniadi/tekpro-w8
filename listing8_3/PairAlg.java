package listing8_3;

import listing8_1.Pair;

public class PairAlg {
    // public static boolean hasNulls(Pair<?> p) {
    // // parameter inputnya adalah Pair dengan ? tipe apapun
    // return p.getFirst() == null || p.getSecond() == null;
    // // p dari class Pair memiliki method getFirst dan getSecond
    // // return nya berupa boolean
    // }

    // public static void swap(Pair<?> p) {
    // swapHelper(p);
    // }

    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
    // menukar first dan second
}
