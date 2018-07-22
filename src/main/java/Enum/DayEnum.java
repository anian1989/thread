package main.java.Enum;

public enum DayEnum {
    MONDAY(1,"周一"),TUESDAY(2,"周二"),WEDNESDAY(3,"周三"),THURSDAY(4,"周四"),FRIDAY(5,"周五"),SATURDAY(6,"周六"),SUNDAY(7,"周天");
    private int type;
    private String dec;

    DayEnum(int type, String dec) {
        this.type = type;
        this.dec = dec;
    }

    public int getType() {
        return type;
    }

    public String getDec() {
        return dec;
    }


}
