package song;
import java.util.Scanner;
public class Common_divisor11_5_2 {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Max_Common_Divisor max = new Max_Common_Divisor();
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("最大公约数为："+max.f(a, b));
max = new Least_common_multiple();
System.out.println("最小公倍数为："+max.f(a, b));
sc.close();
	}
}
class Max_Common_Divisor
{
	 public int f(int a,int b)
	 {
		  int e = a;

	        for( int i = 1;i <= e;i ++){

	            int c = a > b ? a : b;//两个数字的大值
	            int d = a < b ? a : b;//两个数字的小值

	            a = c % d;
	            b = d;

	            if(a == 0) {
	                
	                return b;
	            }
	
		  
	 }
			return b;

	 }
}
class Least_common_multiple extends Max_Common_Divisor//最小公倍数，最大公约数的子类
{
	public int f(int a,int b)
	{
	return ((a*b)/super.f(a, b));
	}

	}
	
