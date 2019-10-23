package controlflaw6;

public class ControlFlaw6 {

    public static void main(String[] args) {
        
        String day = daysOfWeek(6);
        System.out.println(day);
        
    }
    
    
    static public String daysOfWeek(int number){
        String day;
        switch(number){
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = null;
        }
        return day;
    }
    
}
