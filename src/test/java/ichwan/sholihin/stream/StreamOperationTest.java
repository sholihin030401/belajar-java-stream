package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperationTest {

    //map operation: membuat data baru pada stream tanpa mengubah data sebelumnya
    @Test
    void testStreamOperation(){

        List<String> names = List.of("Ichwan", "Sholihin", "Qonita", "Salsabila");
        Stream<String> streamNames = names.stream();
        Stream<String> streamLower = streamNames.map(name -> name.toLowerCase());

        streamLower.forEach(System.out::println);
        names.forEach(System.out::println);
    }

    //stream pipeline: membuat satu kesatuan dalam Stream Operations, tidak perlu membuat banyak variable
    @Test
    void testStreamPipeline(){
        List<String> names = List.of("Ichwan", "Sholihin", "Qonita", "Salsabila");
        names.stream()
                .map(name -> name.toUpperCase())
                //map itu intremediate operation, dia tidak akan berjalan ketika di print out (lazy operation)
                .map(upper -> "Sir " + upper)
                //foreach itu terminal operation, dia akan berjalan sesuai kebutuhan
                .forEach(System.out::println);

    }
}
