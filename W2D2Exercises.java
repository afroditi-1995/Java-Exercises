package w2d2exercises;

public class W2D2Exercises {
    
    public static void main(String[] args) {
       
         
        //EXERCISE 3
        int sum, x;
        x=1;
        sum=0;
        sum+=x;
        System.out.println("The sum is: " + sum);
        System.out.println(".........");
        
        
        
        //EXERCISE 4
        int[] array = {4, 5, -2, 7, -9, 0, 31, 5, -4, -28, 1};
        System.out.println("From first to last:");
        for(int i=0;i<11;i++)
            System.out.println(array[i]);
        System.out.println("From last to first");
        for(int i=10;i>=0;i--)
            System.out.println(array[i]);
        int smallest = array[0];
        int largest = array[0];
        for(int i=1;i<11;i++){
            if (array[i]<smallest)
                smallest = array[i];
            if (array[i]>largest)
                largest = array[i];
        }
        System.out.println("The smallest value of the array is: " + smallest);
        System.out.println("The largest value of the array is: " + largest);
        System.out.println(".............");
        
        
        
        //EXERCISE 5
        int sum1=0;
        int j=1;
        while(j<=10){
            sum1 += j;
            j++;
        }
        System.out.println("The sum of the integers from 1 to 10 is: " + sum1);
        System.out.println("............");
            
        
        
        //EXERCISE 6
        int value=9;
        switch(value){
            case 7:
                System.out.println("Hello");
                break;
            case 10:
                System.out.println("Hi");
                break;
            case 444:
                System.out.println("Good");
                break;
            default:
                System.out.println("No Match Found");
        }
        System.out.println("..........");
        
        
        
        //EXERCISE 7
        for(int i=1;i<=100;i++){
            if (i%4==0 && i%5!=0)
                System.out.println(i);
        }
                
        
    }
    
}
