package ichwan.sholihin.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    //Map<return data, data stream>
    @Test
    void testGroupingBy(){
        Map<String, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8)
                .collect(Collectors.groupingBy(
                        number -> {
                            if (number > 4)
                                return "Besar";
                            else
                                return "Kecil";
                        }
                ));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy(){
        Map<Boolean, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8)
                .collect(Collectors.partitioningBy(
                        number -> {
                            return number > 4;
                        }
                ));

        System.out.println(collect);
    }
}
