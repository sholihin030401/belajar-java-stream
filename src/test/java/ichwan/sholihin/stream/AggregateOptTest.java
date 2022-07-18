package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class AggregateOptTest {

    @Test
    void testNumberMax(){
        Stream.of(1,2,3,6,4,8,10,9)
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testNameMin(){
        Stream.of("Ichwan","Sholihin","Budi","Joko","Yusuf","Budi")
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testSum(){
        var sum = List.of(1,2,6,5,4,7).stream()
                .reduce(0,(value,item) -> value + item);
        System.out.println(sum);
    }

    @Test
    void testFactorial(){
        var factorial = List.of(1,2,6,5,4,7).stream()
                .reduce(1,(value,item) -> value * item);
        System.out.println(factorial);
    }

}
