package listing8_1;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words); // parameternya adalah words (array of String)
        // dan outputnya adalah 2 nilai String dalam objek Pair
        System.out.println("min = " + mm.getFirst());
        // kapital secara ascii lebih dulu dari pada huruf kecil
        System.out.println("max = " + mm.getSecond());
    }
}