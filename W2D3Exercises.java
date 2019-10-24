package w2d3exercises;

import java.util.Scanner;

public class W2D3Exercises {

    public static void main(String[] args) {
        
        //EXERCISE 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your name:");
        String name3 = sc.nextLine();
        System.out.println("Tell me your surname:");
        String surname3 = sc.nextLine();
        System.out.println("Tell me your age:");
        int age3 = sc.nextInt();
        System.out.println("Tell me your favorite color:");
        String favColor = sc.next();
        System.out.println(name3 + " " + surname3 + " " + "your age is " + age3 + " and your favorite color is " + favColor);
        sc.close();
        System.out.println("............");
             
    }

}
