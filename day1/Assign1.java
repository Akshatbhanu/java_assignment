package day1;
//Accept 3 numbers from command line arguments. If number is prime, then print the table of 
//the number. Other wise divide number by 10 and display output
public final class Assign1 
{
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args)
	{
		for(int i=0;i<3;i++)
		{
			int num=Integer.parseInt(args[i]);
			if( isPrime(num) )
			{
				table(num);
			}
			else
			{
				System.out.println(num/10);
			}
			System.out.println();
		}
		
	}

	private static void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n +" * "+i+" = "+n*i);
			
		}
		
	}

}
