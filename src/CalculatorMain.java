
public class CalculatorMain {
	public static void main(String[] args)
	{
		int a = 7;
		int b = 8;
		Calculator c  = new Calculator();
		int d = c.add(a,b);
		System.out.println(d);
	
		float e = 2.6f;
		float f = 6.9f;
		float g = c.add(e, f);
		System.out.println(g);
		
		String s1 = "Hello";
		String s2 = "World";
		String s = c.add(s1, s2);
		System.out.println(s);
	}
}
