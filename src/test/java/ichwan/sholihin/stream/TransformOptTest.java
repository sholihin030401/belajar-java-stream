package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformOptTest {

    @Test
    void testMap(){
        List.of("Ichwan","Sholihin","19312131").stream()
                .map(names -> names.toLowerCase())
                .map(lower -> lower.length())
                .forEach(length -> System.out.println(length));
    }

    //flat map bisa diinputkan lebih dari 1 operasi stream
    @Test
    void testFlatMap(){
        Stream.of("Ichwan","Sholihin","19312131")
                .map(String::toLowerCase)
                .flatMap(lower -> Stream.of(lower, lower.length()))
                .forEach(System.out::println);
    }
}
