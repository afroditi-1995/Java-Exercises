package controlflaw4;

public class ControlFlaw4 {

    public static void main(String[] args) {
        
        int age = 24;
        String condition;
        if(age<16)
            condition = "You cannot drive";
        else if(age<17)
            condition = "You can drive but not vote";
        else if(age<=18)
            condition = "You can vote but not drink";
        else 
            condition = "You can do anything";
        System.out.println(condition);
    }
    
}
