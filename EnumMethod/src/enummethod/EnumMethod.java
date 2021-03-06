
package enummethod;


public class EnumMethod {

    
    public static void main(String[] args) {
       
        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println(name);
        
        
        int ordinal = today.ordinal();
        System.out.println(ordinal);
        
        Week day1 = Week.MONDAY;
        Week day2 = Week.SUNDAY;
        
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        
        System.out.println(result1);
        System.out.println(result2);
        
        
        Week weekday = Week.valueOf("SUNDAY");
        if(weekday == Week.SATURDAY || weekday == Week.SUNDAY){
        System.out.println("It is weekend");
        }
        
        else
            System.out.println("It is week");
        
        Week[] days = Week.values();
        for(Week day:days){
        System.out.println(day);
        }
        
    }
    
}
