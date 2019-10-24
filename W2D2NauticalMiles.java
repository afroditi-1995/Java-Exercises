package w2d2.nauticalmiles;

public class W2D2NauticalMiles {

    public static void main(String[] args) {
        
        double constantKilos = 1.852;
        double constantMiles = 1.150779;
        double nauticalMiles = 125;
        double kilometers = nauticalMiles * constantKilos;
        System.out.println(nauticalMiles + " nautical miles = " + kilometers + " kilometers");
        double miles = nauticalMiles * constantMiles;
        System.out.println(nauticalMiles + " nautical miles = " + miles + " miles");
      
    }
  
    
}
