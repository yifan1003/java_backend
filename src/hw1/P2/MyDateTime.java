package hw1.P2;

public final class MyDateTime {
//    rules to create immutable classes
//    1.Don't provide "setter"methods;
//    2.Make all fields final and private
//    3.Don't allow subclasses to override methods
//    4.special attention when having mutable instance variables
    private final Integer year;
    private final String month;
    private final Integer day;
    public MyDateTime(Integer year, String month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Integer getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public Integer getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + " " + month + " " + day;
    }
}

class TestMain {
    public static void main(String[] args) {
        MyDateTime myDateTime = new MyDateTime(2000,"June", 20);
        System.out.println(myDateTime);
        tryModification(myDateTime.getYear(),myDateTime.getMonth(),myDateTime.getDay());
        System.out.println(myDateTime);
    }
    public static void tryModification(Integer year, String month, Integer day) {
        year = 2020;
        month = "July";
        day = 20;
    }
}
