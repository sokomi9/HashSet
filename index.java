import java.util.HashSet;
import java.util.Set;

public class index{
    public static void main(String a[]){
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(30);
        numbers.add(20);
        numbers.add(120);
        numbers.add(80);
        numbers.add(100);

        for(int set : numbers){
            System.out.println(set);
        }
    }
}