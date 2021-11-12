package work2;
import java.util.Scanner;
public class JavaSy0402 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Student student = new Student(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
	student.show();
	sc.close();
	}
}
class Human
{
//	名,性别,年龄等 属性, 提供构造方法, 提供方法show显示人的信息。
	private String name;
	private String sex;
	private int age;
	public Human(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
void show()
{//{name='zjx',sex='man',age=20,stuId=20201010,score=95.5
System.out.print("name='"+name+"',sex='"+sex+"',age="+age+",");
	}

}
class Student extends Human
{
	private int number;
	private double score;
	public Student(String name, String sex, int age, int number, double score) {
		super(name, sex, age);
		this.number = number;
		this.score = score;
	}
	void show()
	{
		super.show();
		System.out.print("stuId="+number+",score="+score);
	}
	
	}
