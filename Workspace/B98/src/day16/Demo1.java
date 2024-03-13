package day16;

class A
{
	private int i;
	
	A(int i)
	{
		this.i=i;
	}
	
	public int getValue()
	{
		return i;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		A a1=new A(10);
		int v=a1.getValue();
		System.out.println(v);
	}

}
