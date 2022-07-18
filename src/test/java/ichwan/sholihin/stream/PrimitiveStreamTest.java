package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class PrimitiveStreamTest {

    @Test
    void testPrimitiveDataType(){
        IntStream intStream = IntStream.range(1,10);
        //intStream.forEach(System.out::println);

        OptionalDouble optionalDouble = intStream.average();
        optionalDouble.ifPresent(System.out::println);
        IntStream.range(1,5).boxed().forEach(System.out::println);
    }
}
