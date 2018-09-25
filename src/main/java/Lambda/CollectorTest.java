package Lambda;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试Collector的各种方法
 */
public class CollectorTest {
    private final static Logger logger = LoggerFactory.getLogger(CollectorTest.class);
    @Test
    public void test(){
        Double collect = Stream.of(3, 3, 3, 3, 2, 4).collect(Collectors.averagingInt(o->o));
        logger.info("averagingInt:{}",collect);
        Long collect1 = Stream.of(3, 3, 3, 3, 2, 4).collect(Collectors.counting());
        logger.info("counting:{}",collect1);
        Optional<String> collect2 = Stream.of("a", "bb", "ccc", "dddd", "eeee", "ffffff").collect(Collectors.maxBy(((o1, o2) -> o1.length() - o2.length())));
        logger.info("maxBy:{}",collect2.get());
        IntSummaryStatistics collect3 = Stream.of(3, 3, 3, 3, 2, 4).collect(Collectors.summarizingInt(o -> o));
        logger.info("summarizingInt:{}",collect3);

        //分割数据块
        Map<Boolean, List<Integer>> collectParti = Stream.of(1, 2, 3, 4)
                .collect(Collectors.partitioningBy(it -> it % 2 == 0));
        //注意只有true和false两组
        System.out.println("collectParti : " + collectParti);

        //数据分组
        Map<Integer, List<Integer>> collect4 = Stream.of(1, 2, 3, 4).collect(Collectors.groupingBy(it -> it % 3));

        System.out.println("collectGroup : " + collect4);

        //拼接
        String strJoin = Stream.of("1", "2", "3", "4")
                .collect(Collectors.joining(",", "[", "]"));
        logger.info("strJoin: " + strJoin);






    }
}
