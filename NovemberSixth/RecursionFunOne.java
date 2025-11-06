package NovemberSixth;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		if(num>0)
		{
			int digit = num % 10;
			if(digit % 2 == 0)
				return 1 + countEvenDigits(num/10);			
			return 0 + countEvenDigits(num/10);
		}
		return 0;
	}
}