package somemaths2;

public class SomeMaths2 {

    public static void main(String[] args) {
        
        int monthlySalary = 900;
        int annualSalary = 12*900;
        double governmentTaxes = 9d/100;
        double monthlyGov = monthlySalary * governmentTaxes;
        double annualGov = annualSalary * governmentTaxes;
        double monthlyIncome = monthlySalary - monthlyGov;
        double annualIncome = annualSalary - annualGov;
        System.out.println("You get " + monthlyIncome + " and you government " + monthlyGov + " each month");
        System.out.println("You get " + annualIncome + " and you government " + annualGov + " each year");
    }
    
}
