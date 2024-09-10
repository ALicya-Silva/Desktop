import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {

   
    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        List<String> filteredStrings = new ArrayList<>();
        
        
        for (String str : strings) {
            if (predicate.test(str)) {
                filteredStrings.add(str);
            }
        }
        
        return filteredStrings;
    }
}