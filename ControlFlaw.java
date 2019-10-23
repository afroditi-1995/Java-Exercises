package controlflaw;

public class ControlFlaw {

    public static void main(String[] args) {
        
        int age = 24;
        String schoolClass;
        switch(age){
            case 6:
                schoolClass = "First class of elementary school";
                break;
            case 7:
                schoolClass = "Second class of elementary school";
                break;
            case 8:
                schoolClass = "Third class of elementary school";
                break;
            case 9:
                schoolClass = "Fourth class of elementary school";
                break;
            case 10:
                schoolClass = "Fifth class of elementary school";
                break;
            case 11:
                schoolClass = "Sixth class of elementary school";
                break;
            case 12:
                schoolClass = "First class of High School";
                break;           
            case 13:
                schoolClass = "Second class of High School";
                break;           
            case 14:
                schoolClass = "Third class of High School";
                break;     
            case 15:
                schoolClass = "First class of High School";
                break;     
            case 16:
                schoolClass = "Second class of High School";
                break;     
            case 17:
                schoolClass = "Third class of High School";
                break;     
            default:
                schoolClass = null;
                break;
        }
        System.out.println(schoolClass);
        
    }
    
}
