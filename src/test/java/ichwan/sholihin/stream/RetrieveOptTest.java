package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class RetrieveOptTest {

    @Test
    void testLimit(){
        Stream.of("Ichwan","Sholihin","Budi","Joko","Yusuf","Budi","Ichwan")
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip(){
        Stream.of("Ichwan","Sholihin","Budi","Joko","Yusuf","Budi","Ichwan")
                .skip(2)
                .forEach(System.out::println);
    }

    //hanya mengambil data awal yg berhasil di cek, ketika bertemu dengan data false maka operasi berhenti
    @Test
    void testTakeWhile(){
        Stream.of("Ichwan","Sholihin","Budi","Joko","Yusuf","Budi","Ichwan")
                .takeWhile(name -> name.length() < 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile(){
        Stream.of("Ichwan","Sholihin","Budi","Joko","Yusuf","Budi","Ichwan")
                .sorted()
                .dropWhile(name -> name.length() < 4)
                .forEach(System.out::println);
    }
}
