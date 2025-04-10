public class Mar28_03 {
	public static void main(String[] args) {
		try{
			int a[]={10,20,30};
			System.out.println(a[2]);
			int a1=10,b=0,x;
			if(b==0)
			{
				throw new ArithmeticException("Division by zero");
			}
			else{
				x=a1/b;
			}
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{System.out.println("ex1"+ex.getMessage());}
		catch(ArithmeticException e)
		{
			System.out.println("ex2"+e.getMessage());
		}
	}
}
