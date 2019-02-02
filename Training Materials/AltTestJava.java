
public class JavaTest 
{
    private static double savings = 15000;
    private static double monthlyIncome = 2000;
    private static int numMonths = 24;
    
    private static boolean taxed = true;
    private static double taxRate = .125;

    public static void main(String[] args) 
    {
        System.out.println(calcIncome());
    }
    
    private static double calcIncome() 
    {
		if (taxed)
        {
            monthyIncome *= (1 - taxRate);
        }
        for (int i = 0; i < numMonths; i++) 
        {   
            savings += monthlyIncome;
        }
        return savings;
    }
}
