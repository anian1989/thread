package Lambda;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://blog.csdn.net/IO_Field/article/details/54971761
 */
public class LambdaTest {
    private final static Logger logger = LoggerFactory.getLogger(LambdaTest.class);
    final static String[] atp = {"Rafael Nadal", "Novak Djokovic",
            "Stanislas Wawrinka",
            "David Ferrer", "Roger Federer",
            "Andy Murray", "Tomas Berdych",
            "Juan Martin Del Potro"};

    @Test
    public void testFor() {
        List<String> strings = Arrays.asList(atp);
        strings.forEach((str) -> System.out.println(str));
    }

    @Test
    public void testThread() {
        Thread thread = new Thread(() -> {
            System.out.println("-------------------------");
            logger.info("Thread++++++++++++++++=");
        });
        thread.start();

    }

    /**
     * 对中间操作的测试
     */
    @Test
    public void intermediateTest() {
        // distict方法
        List<String> collect = Stream.of("a", "b", "c", "a", "c", "d").distinct().collect(Collectors.toList());
        System.out.println(collect);
        // filter方法
        List<Integer> collect1 = IntStream.range(1, 10).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println(collect1);
        // map方法
        List<Integer> collect2 = Stream.of('a', 'b', 'c').map(c -> c.hashCode()).collect(Collectors.toList());
        System.out.println(collect2);
        //flatmap的作用是类似于多个list合并成一个list
        String poetry = "Where, before me, are the ages that have gone?\n" +
                "And where, behind me, are the coming generations?\n" +
                "I think of heaven and earth, without limit, without end,\n" +
                "And I am all alone and my tears fall down.";
        Stream<String> stream = Arrays.stream(poetry.split("\n"));
        Stream<String> stringStream = stream.flatMap(line -> Arrays.stream(line.split(" ")));

        List<String> collect3 = stringStream.map(w -> {
            if (w.endsWith(",") || w.endsWith(".") || w.endsWith("?")) {
                return w.substring(0, w.length() - 1).trim().toLowerCase();
            } else {
                return w.trim().toLowerCase();
            }


        }).distinct().collect(Collectors.toList());
        System.out.println(collect3);


    }

    /**
     * reduce 操作可以实现从Stream中生成一个值，其生成的值不是随意的，而是根据指定的计算模型。比如，之前提到count、min和max方
     * 法，因为常用而被纳入标准库中。事实上，这些方法都是reduce操作
     * reduce应该是缩短的意思
     * https://blog.csdn.net/IO_Field/article/details/54971679
     */
    @Test
    public void testReduce() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int sum = list.stream().reduce((x, y) -> {
            logger.info("reduce X :{}",x);
            logger.info("reduce Y :{}",y);
            return  x*10 + y;}).get();
        logger.info("reduce 1 :{}",sum);

        // 字符串连接，concat = "ABCD"
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        // 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
        // 求和，sumValue = 10, 有起始值
        int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        // 求和，sumValue = 10, 无起始值
        sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
        // 过滤，字符串连接，concat = "ace"
        concat = Stream.of("a", "B", "c", "D", "e", "F").
                filter(x -> x.compareTo("Z") > 0).
                reduce("", String::concat);
    }

    /**
     * limit 返回 Stream 的前面 n 个元素；
     * skip 则是扔掉前 n 个元素（它是由一个叫 subStream 的方法改名而来）。
     */
    @Test
    public void testLimitAndSkip() {
        List<Person> persons = Lists.newArrayList();
        for (int i = 1; i <= 10000; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<String> personList2 = persons.stream().
                map(Person::getName).limit(10).skip(3).collect(Collectors.toList());
        logger.info("limit skip:{}",personList2);
    }
    private class Person {
        public int no;
        private String name;
        public Person (int no, String name) {
            this.no = no;
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    /**
     * sorted
     *
     * 对 Stream 的排序通过 sorted 进行，它比数组的排序更强之处在于你可以首先对 Stream 进行各类 map、filter、limit、skip 甚至 distinct 来减少元素数量后，再排序，这能帮助程序明显缩短执行时间
     */


    /**
     * 生成Stream的几种方式
     */
    public void createStream(){

    }

    /**
     * peek方法生成一个包含原Stream的所有元素的新Stream，
     * 同时会提供一个消费函数（Consumer实例），
     * 新Stream每个元素被消费的时候都会执行给定的消费函数，并且消费函数优先执行
     */
    @Test
    public void peekTest(){
        Stream.of(1,2,3,4,5,6,7).peek(i-> System.out.println(i*i)).forEach(System.out::println);
    }
    @Test
    public void sortedTest(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(3, "Nilesh", 10));

        System.out.println("---Natural Sorting by Name---");
        List<Student> slist = list.stream().sorted().collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Natural Sorting by Name in reverse order---");
        slist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age---");
        slist = list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age with reverse order---");
        slist = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
    }
}
