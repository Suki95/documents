public class TestArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]=new int[3];
		marks[0]=90;
		marks[1]=80;
		marks[2]=70;
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks["+"i"+"] : "+ marks[i]);
		}
		System.out.println("****************");
		int nums[]=null;
		nums=new int[3];
		nums[0]=90;
		nums[1]=80;
		nums[2]=70;
		
		System.out.println("****************");
		String names[]= {"Patani","IGate","Capgemini"};
		
		System.out.println("****************");
		int A[][]=new int [3][2];
		A[0][0]=90;
		A[0][1]=90;
		A[0][2]=90;
		A[1][0]=90;
		A[1][1]=90;
		A[1][2]=90;
		A[2][0]=90;
		A[2][1]=90;
		A[2][2]=90;
	}

}
