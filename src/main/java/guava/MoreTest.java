package guava;

import com.google.common.base.MoreObjects;

public class MoreTest {

    public static void main(String[] args){
        Integer nonNull = 5;
        Integer integer = MoreObjects.firstNonNull(null, 0);
        System.out.println(integer);
        String s = MoreObjects.toStringHelper(Person.class).add("age", 23).add("name1", "zhangsan").toString();
        System.out.println(s);
    }
}
