//Scanner a valid age (valid age ∈ [0,20] )
package validage;

import java.util.Scanner;

public class ValidAge {

    public static void main(String[] args) {
       
        age();
        
        
    }
    
    public static int age (){
        System.out.println("Please enter your age");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            System.out.println("Please enter a valid age");
            scanner.next();
        }
        int age = scanner.nextInt();
        while (age<0 || age>120){
            System.out.println("Please enter a valid age");
            age = scanner.nextInt();
        }
        
        System.out.println("Your age is: " + age);
        scanner.close();
        return age;
    }
    
}
