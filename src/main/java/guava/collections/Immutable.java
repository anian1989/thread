package guava.collections;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;

public class Immutable {
    @Test
    public void testImmutable(){
        HashSet<Integer> integers = new HashSet<Integer>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        // 第一种创建不可变集合的方式
        ImmutableSet<Integer> integers1 = ImmutableSet.copyOf(integers);
        // 第二种创建不可变集合的方式
        ImmutableSet<Integer> immutableSet2 = ImmutableSet.<Integer>builder().addAll(integers).add(66).build();
        // 第三种创建不可变集合的方式
        ImmutableSet<String> of = ImmutableSet.of("a", "b", "c", "a", "d", "b");

    }
}
