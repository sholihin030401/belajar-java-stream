package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class FilterOptTest {

    @Test
    void testFilter(){
        Stream.of("Ichwan","Sholihin","Budi","Joko","Yusuf","Budi","Ichwan")
                .filter(name -> name.length()>4)
                .distinct()
                .forEach(System.out::println);
    }
}
