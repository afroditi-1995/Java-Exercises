
package fullname;

public class FullName {

        public static void main(String[] args) {
        String fullName = fullName("Afroditi", "Vlachou");
        System.out.println(fullName);
    }
        
        public static String fullName(String firstName,String lastName) {
        String fullName=(firstName + " " + lastName);
        fullName = fullName.toUpperCase();
        return fullName;
    }       
    
}
