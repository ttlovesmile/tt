package work;

import java.io.PrintStream;
public class RectangleDemo {

	public static void main(String[] ages)throws Exception{
		
		PrintStream out =new PrintStream(System.out,true,"UTF-8");
		Rectangle r=new Rectangle ();

		r.setLength(12.0);

		r.setWidth(30.0);

		out.println("长方形的面积为："+r.area());		

	}

}
class Rectangle
{
	private double length;
	private double width;
	Rectangle()
	{}
	void setLength(double length)
	{
		this.length = length;
	}
	void setWidth(double width)
	{
		this.width = width;
	}
	double area()
	{
		
		return length*width;
	}
	}