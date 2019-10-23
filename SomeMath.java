package somemath;

public class SomeMath {

    public static void main(String[] args) {
        
        int age1 = 24;
        int currentYear = 2019;
        int yearOfBirth1 = currentYear-age1;
        System.out.println("You were born in " + yearOfBirth1);
        
        //3 MORE PEOPLE
        int age[] = {32, 79, 15}; 
        int yearOfBirth[] = new int[3];
        int age1960, age2040;
        for(int i=0;i<=2;i++){
            int counter = i+1;
            yearOfBirth[i] = currentYear-age[i];
            System.out.println("Person number " + counter + " were born on" +yearOfBirth[i]);
            age1960 = 1960-yearOfBirth[i];
            if(age1960<0){
                System.out.println("Person number " + counter + " wasn't born on 1960");
            }
            else{
                System.out.println("Person number " + counter + " was " + age1960 + "on 1960");
            }
            age2040 = 2040-yearOfBirth[i];
            System.out.println("Person number " + counter + " will be " + age2040 + " in 2040");
        }
        
    }    
}
