public class TestMaxDemo
{
	public static void main(String[] args)
	{
		MaxFinder mf=(a,b)->(a>b)?a:b;
		System.out.println("Greatest Number is : " +mf.max(56, 67));
	}
}