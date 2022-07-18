package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ParallelStreamTest {

    //cek apakah data keluar secara berurutan atau parallel
    @Test
    void testSequential(){
        Stream.of(1,2,3,4,5,6,7,8)
                .forEach(number -> System.out.println(Thread.currentThread().getName() + " : "+number));
    }

    //data keluar secara random
    @Test
    void testParallel(){
        Stream.of(1,2,3,4,5,6,7,8)
                .parallel()
                .forEach(number -> System.out.println(Thread.currentThread().getName() + " : "+number));
    }
}
