package loops.arrays2;

public class LoopsArrays2 {
    
    public static void main(String[] args) {
       
        int[] numbers = {2, -1, 5, 0, 7};
        
        //SUM
        int sum=0;
        for(int i=0;i<=4;i++)
           sum += numbers[i]; 
        System.out.println("The sum of the numbers is: " + sum);
        
        
        //SMALLEST
        int smallest=1000;
        for(int i=0;i<=4;i++){
            if(numbers[i]<=smallest)
                smallest=numbers[i];
        }
        System.out.println("The smallest number is: " + smallest);
        
       
        //LARGEST
        int largest=-1000;
        for(int i=0;i<=4;i++){
            if(numbers[i]>=largest)
                largest=numbers[i];
        }
        System.out.println("The largest number is: " + largest);    
        
       
        //AVERAGE VALUE
        
        int size = numbers.length;
        double averageValue = (double)sum/size;
        System.out.println("The average value is: " + averageValue);
        
    }
    
}
