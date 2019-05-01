
package enumexample;
import java.util.Calendar;

public class Enumexample {


    public static void main(String[] args) {
        
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        
        switch(week){
            case 1:
                today = Week.SUNDAY; break;
                case 2:
                   today = Week.MONDAY; break;
                    case 3:
                       today = Week.TUESDAY; break;
                        case 4:
                           today = Week.WEDNESDAY; break;
                            case 5:
                              today = Week.THUESDAY; break;
                                case 6:
                                 today = Week.FRIDAY; break;
                                    case 7:
                                     today = Week.SATURDAY; break;
                
        
        }
        System.out.println("Today is  " + today);
        
        if(today == Week.SUNDAY)
            System.out.println("I will play soccer game in this sunday.");
        
        else
            System.out.println("I will study JAVA programming.");
        
        
    }
    
}
