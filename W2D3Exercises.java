package w2d3exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class W2D3Exercises {

    public static void main(String[] args) throws IOException {
        
        //EXERCISE 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your name:");
        String name = sc.nextLine();
        System.out.println("Tell me your surname:");
        String surname = sc.nextLine();
        System.out.println("Tell me your age:");
        int age = sc.nextInt();
        System.out.println("Tell me your favorite color:");
        String favColor = sc.next();
        String text = name + " " + surname + " " + "your age is " + age + " and your favorite color is " + favColor;
        String path = "C:\\Users\\frodi\\Documents\\Examples\\myFile.txt";
        writeToFile(path, text);
        System.out.println("............");
        
        
        
        //EXERCISE 4
        
       
        Boolean statement = (age>=18 && age<=66 && favColor.charAt(0)=='b');
        if(statement == true){
            writeToFile(path, text);
        }
                         
    }
    
    public static void writeToFile(String path, String text) throws IOException{
        FileWriter fileWriter = new FileWriter(path); //1η κλάση
        BufferedWriter output = new BufferedWriter(fileWriter); //2η κλάση. Χ
        output.write(text); //περνάμε το text στο αρχείο που έχει μονοπάτι αυτό ποθ βάλαμε στο path
        output.close();
        fileWriter.close(); //κλείνουμε το κανάλι
    }

}
