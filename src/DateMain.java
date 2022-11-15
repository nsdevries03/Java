public class DateMain {
    public static void main(String[] args) {
        Date d1 = new Date(2009, 10, 17);
        Date d2 = new Date(2008, 7, 28);
        Date d3 = new Date(d1);
        Date d4 = new Date(-75872, 10, -2);
        d4.setMonth(13);

        System.out.println(d1.getYear());
        System.out.println(d1.getDaysInMonth());
        System.out.println(d1.getDaysInYear());
        System.out.println(d1.isLeapYear());
        System.out.println();
        System.out.println(d2.getYear());
        System.out.println(d2.getDaysInMonth());
        System.out.println(d2.getDaysInYear());
        System.out.println(d2.isLeapYear());
        System.out.println();
        System.out.println(d3.getYear());
        System.out.println(d3.getDaysInMonth());
        System.out.println(d3.getDaysInYear());
        System.out.println(d3.isLeapYear());
        System.out.println();
        System.out.println(d4.getYear());
        System.out.println(d4.getDaysInMonth());
        System.out.println(d4.getDaysInYear());
        System.out.println(d4.isLeapYear());
        System.out.println();
    }
}
