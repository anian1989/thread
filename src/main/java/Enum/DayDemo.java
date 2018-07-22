package main.java.Enum;

/**
 * 枚举基础方法测试类
 */
public class DayDemo {
    public static void main(String[] args){

        DayEnum[] dayEnums = new DayEnum[]{DayEnum.MONDAY, DayEnum.TUESDAY, DayEnum.WEDNESDAY,
                DayEnum.THURSDAY, DayEnum.FRIDAY, DayEnum.SATURDAY, DayEnum.SUNDAY};
        for (int i =0;i<dayEnums.length;i++) {
            System.out.println("day["+i+"].ordinal:"+dayEnums[i].ordinal());

        }
        System.out.println("-------------------------------------");
        //通过compareTo方法比较,实际上其内部是通过ordinal()值比较的
        System.out.println("days[0].compareTo(days[1]):"+dayEnums[0].compareTo(dayEnums[1]));
        System.out.println("days[0].compareTo(days[2]):"+dayEnums[0].compareTo(dayEnums[2]));

        System.out.println("-------------------------------------");

        //获取该枚举对象的Class对象引用,当然也可以通过getClass方法
        Class<? extends DayEnum> aClass = dayEnums[0].getDeclaringClass();
        System.out.println("class:"+aClass);

        System.out.println("-------------------------------------");

        //name()
        System.out.println("days[0].name():"+dayEnums[0].name());
        System.out.println("days[1].name():"+dayEnums[1].name());
        System.out.println("days[2].name():"+dayEnums[2].name());
        System.out.println("days[3].name():"+dayEnums[3].name());

        System.out.println("-------------------------------------");

        System.out.println("days[0].toString():"+dayEnums[0].toString());
        System.out.println("days[1].toString():"+dayEnums[1].toString());
        System.out.println("days[2].toString():"+dayEnums[2].toString());
        System.out.println("days[3].toString():"+dayEnums[3].toString());

        System.out.println("-------------------------------------");

        DayEnum dayEnum = Enum.valueOf(DayEnum.class, dayEnums[0].name());
        System.out.println(dayEnum);

        System.out.println("-------------------------------------");
        DayEnum[] values = DayEnum.values();
        // 通过Class的getEnumConstants方法获取所有的枚举
        DayEnum[] enumConstants = values[0].getClass().getEnumConstants();

        Byte aByte = new Byte("21");
        String b = "21";
        if (aByte.toString().equals(b)){
            System.out.println("===================================");
        }else{
            System.out.println("llllllllllllllllllll");
        }

    }
}
