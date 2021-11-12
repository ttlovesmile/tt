package work2;
import java.util.*;
import java.text.DecimalFormat;
public class JavaSy0403 {
	public static void main(String args[])
	{
		Scanner scanner = new  Scanner(System.in);
		Calculate calculate = new Calculate(scanner.nextInt(),scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(),scanner.nextBoolean(),scanner.nextBoolean(),scanner.next(),scanner.next());
		System.out.println(calculate.addint());
		System.out.println(new DecimalFormat("0.00").format(calculate.adddouble()));
		System.out.println(calculate.addboolean());
		System.out.println(calculate.addstring());
		scanner.close();
}
}
class Calculate
{
	private int a,b;
	private double c,d;
	private boolean f,t;
	private String e,g;
	public Calculate(int a, int b, double c, double d, boolean f, boolean t, String e, String g) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.f = f;
		this.t = t;
		this.e = e;
		this.g = g;
	}
	int addint()//整数相加
	{
	return (a+b);	
	}	
	double adddouble()
	{
		double j  = c+d;
	return (j);	
	}
	boolean addboolean()
	{
		boolean and = f&t;
		return and;
	}
	String addstring()
	{
		
		
		return e+' '+g;
		
	
	
	}
}
