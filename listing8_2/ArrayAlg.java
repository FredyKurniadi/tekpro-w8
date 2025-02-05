package listing8_2;

import listing8_1.Pair;

public class ArrayAlg {
    /**
     * Gets the minimum and maximum of an array of objects of type T.
     * 
     * @param a an array of objects of type T
     * @return a pair with the min and max values, or null if a is null or empty
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        // parameter inputnya adalah apapun yang meng-implements Comparable
        if (a == null || a.length == 0)
            return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0)
                min = a[i];
            if (max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new Pair<>(min, max);
    }
}
