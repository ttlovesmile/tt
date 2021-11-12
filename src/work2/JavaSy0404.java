package work2;
//.定义员工类Employee, 有姓名, 出生月等属性, 提供构造方法,
//提供一个返回指定月工资的方法getSalary(int month),  
//如果发工资的月份是员工的出生月,发放生日奖励200。
//定义固定月薪的员工类SalariedEmpoloyee, 增加月薪字段, 提供构造方法, 重写计算工资的方法。
//定义销售人员类SalesEmployee , 增加底薪, 销售额等属性,
//提供构造方法, 重写计算工资的方法,工资的计算方法是底薪+按销售额百分之十提成。
import java.util.Scanner;
public class JavaSy0404 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee(scanner.next(),scanner.nextInt(),scanner.nextInt());
		int month = scanner.nextInt(); 
		System.out.println("SalariedEmployee{name=‘"+employee.getName()+"’,birthmonth="+employee.getBirthmonth()+",monthSalary="+employee.getMonthSalary()+"}");
System.out.println(employee.getSalary(month));	
System.out.println(employee.getMonthSalary());
	}

}
class Employee
{
	private String name;
	private int birthmonth;
	private int  monthSalary;
	private int month;
	public Employee(String name, int birthmonth, int monthSalary) {
		this.name = name;
		this.birthmonth = birthmonth;
		this.monthSalary = monthSalary;
		
	}
public int	getSalary(int month)
{
	if(month == birthmonth)
	{
		return (monthSalary+200);
	}
	else 
		return monthSalary;
	}
	public String getName() {
		return name;
	}
	public int getBirthmonth() {

		return birthmonth;
	}
	public double getMonthSalary() {
		return monthSalary;
	}
	

	}
class SalariedEmpoloyee extends Employee
{
private int sales;
String name; 
int birthmonth; 
int monthSalary; 
int month;
	

	public SalariedEmpoloyee(String name, int birthmonth, int monthSalary,int sales) {
	super(name, birthmonth, monthSalary);
	this.sales = sales;
	
}


	public int	getSalary(int month)
	{
		if(month == birthmonth)
		{
			return (int)(monthSalary+200+(sales/0.1));
		}
		else 
			return (int)(monthSalary+(sales/0.1));
		}
		
	}


	
	