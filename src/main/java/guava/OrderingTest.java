package guava;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Ordering;
import com.google.common.util.concurrent.Service;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class OrderingTest {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private final static Logger logger = LoggerFactory.getLogger(OrderingTest.class);

    public static  void main(String[] args){

        List<String> list = Lists.newArrayList();
        list.add("peida");
        list.add("jerry");
        list.add("harry");
        list.add("eva");
        list.add("jhon");
        list.add("neron");

        Ordering<String> natural = Ordering.natural();
        /**
         * 使用toString()返回的字符串按字典顺序进行排序；
         */
        Ordering<Object> usingToString = Ordering.usingToString();
        /**
         * 返回一个所有对象的任意顺序， 即compare(a, b) == 0 就是 a == b (identity equality)。
         * 本身的排序是没有任何含义， 但是在VM的生命周期是一个常量。
         */
        Ordering<Object> arbitrary = Ordering.arbitrary();
        List<String> strings = natural.sortedCopy(list);
        System.out.println("natural:"+JSON.toJSON(strings));
        System.out.println("list:"+JSON.toJSON(list));

        List<String> strings1 = usingToString.sortedCopy(list);
        System.out.println("usingToString:"+JSON.toJSON(strings1));
        List<String> strings2 = arbitrary.sortedCopy(list);
        System.out.println("strings2:"+JSON.toJSON(strings2));
        ArrayList<String> list2 = Lists.newArrayList();
        Collections.copy(list,list2);
        Ordering<String> compound = natural.compound((Comparator<? super String>) list2);
        logger.info("compound:"+JSON.toJSONString(compound));


    }
    Comparator<String> byLength = new Comparator<String>() {
        public int compare(String left, String right) {
            return -Integer.compare(right.hashCode(), left.hashCode());
        }
    };

    @Test
    public void chain_comparators() {

        // When reading a chain of Ordering calls, work "backward" from right to left.

        List<String> random = Lists.newArrayList("WELCOME1", "welcome", "to","To",
                "leveluplunch");
        /**
         * 组合条件的排序，类似于sql语句的order by a,b
         * 先以a排，再以b排
         */
        List<String> sorted = Ordering.from(String.CASE_INSENSITIVE_ORDER)
                .compound(byLength).sortedCopy(random);

        System.out.println(sorted);
    }

    @Test
    public void testLexicographical() {
        List<String> names1 = Lists.newArrayList("whiskey1", "tango", "golf");
        List<String> names2 = Lists.newArrayList("whiskey1", "1tango", "foxtrot");
        List<String> names3 = Lists.newArrayList("whiskey1", "1tango", "efoxtrot");
        List<String> names4 = Lists.newArrayList("Vhiskey1", "1tango", "efoxtrot");
        List<Iterable<String>> namesListList = Lists.newArrayList();
        namesListList.add(names1);
        namesListList.add(names2);
        namesListList.add(names3);
        namesListList.add(names4);
        /**
         * lexicographical 是对纵向的数据按照字典的出现顺序进行比较，确定数据的顺序
         */
        final Ordering<Iterable<String>> lexOrd = Ordering.<String>natural().lexicographical();

        Collections.sort(namesListList, lexOrd);

        System.out.println(Joiner.on(',').join(namesListList));
    }

    @Test
    public void onResultOfTest(){
        /**
         * onResult是对使用返回对象的compare方法进行比较
         */
        Function<Object, String> toSimpleClassName = new Function<Object, String>() {
            @Override
            public String apply(Object obj) {
                return obj.getClass().getSimpleName();
            }
        };

        Ordering<Object> bySimpleClassName = Ordering.natural().onResultOf(toSimpleClassName);


        System.out.println(bySimpleClassName.sortedCopy(
                                ImmutableList.of("foo", 42, 'x', "bar", 666)
                        )
        ); // [x, 42, 666, foo, bar]

        System.out.println(
                bySimpleClassName.reverse().compound(Ordering.natural())
                        .sortedCopy(
                                ImmutableList.of(3, 'y', true, "foo", 'z', 1, 'x', "bar", 2, false)
                        )
        );

    }
    @Test
    public void greatedOfTest(){
        ArrayList<Integer> list = Lists.newArrayList();
        for (int i = 1; i < 30; i++) {
            Random random = new Random();
            list.add(random.nextInt(i*10));
        }
        List<Integer> integers = new Ordering<Integer>() {

            @Override
            public int compare(Integer left, Integer right) {
                return right < left ? 1 : -1;
            }
        }.greatestOf(list, 10);
        logger.info("list:{}",JSON.toJSONString(list));
        logger.info("sublist:{}",JSON.toJSONString(integers));

    }

    /**
     * explicit是指定比较的范围以及顺序，被比较的数据要在此范围内
     */
    @Test
    public void explicitTest(){
        ArrayList<Integer> list = Lists.newArrayList();
        for (int i = 1; i < 10; i++) {

            list.add(i);
        }

        logger.info("list:{}",JSON.toJSONString(list));
        List<Integer> integers = Ordering.explicit(1, 3, 2,4,6,5,9,8,7,10).sortedCopy(list);

        logger.info("sublist:{}",JSON.toJSONString(integers));

    }

    /*@Test
    public void explicit_order_or_order_enum() {

        // Order states, an enum, in an explicit order
        Ordering<Service.State> byMidwestState = Ordering.explicit(State.Illinois,
                State.Indiana, State.Iowa, State.Michigan, State.Minnesota,
                State.Ohio, State.Wisconsin);

        List<State> states = Lists.newArrayList(State.Iowa, State.Indiana,
                State.Wisconsin, State.Minnesota, State.Ohio, State.Illinois);

        Collections.sort(states, byMidwestState);

        System.out.println(states);
    }*/
}
