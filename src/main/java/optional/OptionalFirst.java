package optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * 学习optional类的使用
 * Optional是应对nullPointException的问题
 */
public class OptionalFirst {
    private final static Logger logger = LoggerFactory.getLogger(OptionalFirst.class);
    public static void main(String[] args){
//        empty()方法用于创建一个没有值的Optional对象
//        empty()方法创建的对象没有值，如果对emptyOpt变量调用isPresent()方法会返回false，调用get()方法抛出NullPointerException异常。
        Optional<Object> empty = Optional.empty();
        logger.info("Optional-empty.isPresent():{}",empty.isPresent());
        // logger.info("Optional-empty.get:{}",empty.get());

        // of()方法使用一个非空的值创建Optional对象

        String str ="Hello World";
        Optional<String> stringOptional = Optional.of(str);
        //ofNullable()方法接收一个可以为null的值
        String strNull = null;
        Optional<String> strNullOptional = Optional.ofNullable(strNull);
        boolean present = strNullOptional.isPresent();
        logger.info("NULL isPresent:{}",present);
        //使用Optional中提供的map()
        String strMap = "KKKKK";
        Optional<String> strMapOptional = Optional.ofNullable(strMap);
        Optional<Integer> integer = strMapOptional.map(s -> s.hashCode());
        logger.info("Optional-map,{}",integer.isPresent()? integer.get():-10);


        //orElse()：如果有值就返回，否则返回一个给定的值作为默认值；
        String strOrElse = null;
        Optional<String> strOrElse1 = Optional.ofNullable(strOrElse);
        String beijing = strOrElse1.orElse("BEIJING");
        logger.info("OrElse:{}",beijing);

        String strOrElseGet = "NULL";
        Optional<String> strOrElseGet1 = Optional.ofNullable(strOrElseGet);
        String s = strOrElseGet1.orElseGet(() -> "SHANGHAI");
        logger.info("OrElseGet:",s);
        //filter()方法可用于判断Optional对象是否满足给定条件，一般用于条件过滤：
        Optional<String> optional = Optional.of("lw900925@163.com");
        optional = optional.filter(kk -> kk.contains("163"));
        logger.info("filter:{}",optional.orElseGet(()->"TTTT"));

    }
}
