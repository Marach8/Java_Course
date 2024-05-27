package Java_Course;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hello {
    public static void main(String [] args){
        Collection<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        //System.out.print(numbers);

        Map<String, String> map = new HashMap<>();
        map.putIfAbsent("name", "Ajah Emmmanue Amarachi");
        System.out.println(map);
    }
}
