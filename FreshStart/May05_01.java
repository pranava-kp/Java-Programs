public class May05_01 {
    public enum Day
    {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }    
    public static void main(String[] args) {
        Day d=Day.SATURDAY;
        int n=d.ordinal();
        System.out.println(d.getClass());
        System.out.println(n);
        System.out.println(d instanceof Enum);
        System.out.println(Day.class);
    }
}
