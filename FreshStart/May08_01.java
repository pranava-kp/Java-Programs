class swap1<T>
{
	T a,b;
	static void display()
	{
		System.out.println("in class function");
	}
	
	static<T> void display1(H j)
	{
		System.out.println("in class function "+j);
	}
}
public class May08_01 {

	public static void main(String[] args) {
		swap1<Integer> s = new swap1<>();
		swap1.display();
		swap1.display1("With 1 GFP");
		

	}

}