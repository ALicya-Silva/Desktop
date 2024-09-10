import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
    
        List<String> strings = List.of("arroz", "banana", "carne", "alho");
        List<String> filtered = StringFilter.filterStrings(strings, s -> s.startsWith("b"));
        System.out.println(filtered); 

       
        List<Integer> numbers = List.of(-10, 5, -3, 7, 0, -1);
        List<Integer> mutableNumbers = new ArrayList<>(numbers);
        NumberFilter.removeNegativeNumbers(mutableNumbers);
        System.out.println(mutableNumbers);

    
        Integer firstMatch = ElementFilter.findFirstMatch1(mutableNumbers, n -> n > 0);
        System.out.println(firstMatch); 
    }
}