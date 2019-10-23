package controlflaw3;

public class ControlFlaw3 {

    public static void main(String[] args) {
        
        String month = "October";
        int numberOfDays;
        switch(month){
            case "January":
                numberOfDays = 31;
                break;
            case "February":
                numberOfDays = 28; //if statement gia disekto
                break;
            case "March":
                numberOfDays = 31;
                break;
            case "April":
                numberOfDays = 30;
                break;
            case "May":
                numberOfDays = 31;
                break;
            case "June":
                numberOfDays = 30;
                break;
            case "July":
                numberOfDays = 31;
                break;           
            case "August":
                numberOfDays = 31;
                break;           
            case "September":
                numberOfDays = 30;
                break;     
            case "October":
                numberOfDays = 31;
                break;     
            case "November":
                numberOfDays = 30;
                break;     
            case "December":
                numberOfDays = 31;
                break;     
            default:
                numberOfDays = 0;
                break;
        }
        System.out.println(numberOfDays);
    }
    
}
