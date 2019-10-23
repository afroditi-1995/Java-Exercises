package controlflaw5;

public class ControlFlaw5 {

    public static void main(String[] args) {
        
        double weight=75d;
        String planet="Mars";
        switch(planet){
            case "Venus":
                weight*=0.78;
                break;
            case "Mars":
                weight*=0.39;
                break;
            case "Jupiter":
                weight*=2.65;
                break;
            case "Saturn":
                weight*=1.17;
                break;
            case "Uranus":
                weight*=1.05;
                break;
            case "Neptune":
                weight*=1.23;
                break;
            default:
                System.out.println("Wrong input");
                weight=0;
            }
        System.out.println(weight);
    }
    
}
