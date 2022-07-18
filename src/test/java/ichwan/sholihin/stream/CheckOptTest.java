package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CheckOptTest {

    @Test
    void testAnyMatch(){
        boolean match = Stream.of(1,2,3,4,5,6,7,8).anyMatch(number -> number > 5);

        System.out.println(match);
    }

    @Test
    void testAllMatch(){
        boolean match = Stream.of(1,2,3,4,5,6,7,8).allMatch(number -> number > 5);

        System.out.println(match);
    }

    @Test
    void testNoneMatch(){
        boolean match = Stream.of(1,2,3,4,5,6,7,8).noneMatch(number -> number > 5);

        System.out.println(match);
    }
}
