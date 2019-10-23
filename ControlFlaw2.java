package controlflaw2;

public class ControlFlaw2 {

    public static void main(String[] args) {
       
        String currentMonth = "October";
        String season;
        if(currentMonth=="September" || currentMonth=="October" || currentMonth=="November")
            season = "Autumn";
        else if(currentMonth=="December" || currentMonth=="January" || currentMonth=="February")
            season = "Winter";
        else if(currentMonth=="March" || currentMonth=="April" || currentMonth=="May")
            season = "Spring";
        else if(currentMonth=="June" || currentMonth=="July" || currentMonth=="August")
            season = "Summer";
        else
            season = "Wrong input";
        System.out.println(season);
        
    }
    
}
