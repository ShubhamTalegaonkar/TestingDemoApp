package Java_program;

public class Millionaire_Secret {

	public static void main(String[] args) 
	{
		double  Actual_Investment = 10000,
				Current_Value,
				Total_Return,
				Intrest,
				ROI = 6,
				Investing_for_Month = 36;
		
		
		for(int i=1;i<=Investing_for_Month; i++ )
		{
			//600
			Intrest = Actual_Investment * ROI / 100 ;
			//600+10000
			Current_Value = Actual_Investment + Intrest ;
			
			Total_Return = Current_Value+Intrest ;
			System.out.println(2*i);
			System.out.println("After "+ (12+i) +" Months Return = " + Total_Return);
		}		
	}
}
