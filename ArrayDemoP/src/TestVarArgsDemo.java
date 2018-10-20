
public class TestVarArgsDemo {
	public int add(int ...nums)
	{
		int sum=0;
		for(int tempNum:nums)
		{
			sum=sum+tempNum;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestVarArgsDemo obj1=new TestVarArgsDemo();
System.out.println("addition of number: "+ obj1.add(7,8,10));
System.out.println("addition of number: "+ obj1.add());
	}

}
