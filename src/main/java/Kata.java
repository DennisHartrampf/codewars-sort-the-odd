import java.util.Arrays;
import java.util.PrimitiveIterator;

public class Kata {
    public static int[] sortArray(int[] array) {
        PrimitiveIterator.OfInt sortedOdds = Arrays
                                                 .stream(array)
                                                 .filter(Kata::isOdd)
                                                 .sorted()
                                                 .iterator();

        return Arrays
                   .stream(array)
                   .map(number -> isOdd(number) ? sortedOdds.next() : number)
                   .toArray();
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
