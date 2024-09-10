import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {

  
    public static void removeNegativeNumbers(List<Integer> numbers) {
     
        Predicate<Integer> isNegative = n -> n < 0;
        
     
        numbers.removeIf(isNegative);
    }
}