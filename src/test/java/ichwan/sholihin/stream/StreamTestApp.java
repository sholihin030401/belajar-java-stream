package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTestApp {

    @Test
    void testCreateStream(){
        //bisa tunggal bisa multiple data
        //tidak bisa dideklarasikan dua kali ketika menggunakan foreach
        Stream<String> dataStream = Stream.of("Ichwan","Sholihin");
        dataStream.forEach(System.out::println);
        Stream<String> emptyStream = Stream.empty();
        Stream<String> nullStream = Stream.ofNullable(null);
        Stream<Integer> arrayStream = Arrays.stream(new Integer[]{1,2,3,5});
    }

    @Test
    void testCreateInfiniteStream(){
        //loop secara terus menerus
        Stream<String> stream = Stream.generate(() -> "Ichwan Sholihin");
        stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 2);
        iterate.forEach(System.out::println);
    }

    @Test
    void testStreamBuilder(){

        //return data type buildernya
        Stream<Object> stream = Stream.builder()
                .add("Ichwan").add("Sholihin").build();

        stream.forEach(System.out::println);
    }
}
