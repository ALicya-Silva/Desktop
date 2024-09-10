import java.util.List;
import java.util.function.Predicate;

public class ElementFilter {

   
    public static Integer findFirstMatch1(List<Integer> numbers, Predicate<Integer> predicate) {
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                return number;
            }
        }
        return null; 
   
}
}