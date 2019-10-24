package w2d3exercices2;

import java.util.Scanner;

public class W2D3Exercices2 {

    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your name:");
        String name = scanner.nextLine();
        System.out.println("Tell me your surname:");
        String surname = scanner.nextLine();
        String favorColor = favColor();
        int age = age();
        System.out.println(name + " " + surname + " " + "your age is " + age + " and your favorite color is " + favorColor);
        
    }
    
    //METHOD 1  
    public static String favColor(){
        System.out.println("Tell me your favorite color:");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        while(text.charAt(0) != 'b'){
            System.out.println("Enter a valid color which starts with the letter 'b':");
            text = sc.next();
        }
        sc.close();
        return text;
    }
    
    
    //METHOD 2 
    public static int age(){
        System.out.println("Tell me your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        while(age<18 || age>66){
            System.out.println("Enter a valid age:");
            age = sc.nextInt();        
        }
        sc.close();
        return age;
    }
    
}
