package work;
class Student {

	private String name;

	private int age;

	private String degree;

	public Student(String n1, int a1, String d1) // 构造方法

	{

		name = n1;

		age = a1;

		degree = d1;

	}
 

	

	public void show() {

		System.out.print("学生、" + name + "   " + "年龄、" + age + "   " + "学位、"

				+ degree + '\n');

	}
}


class Undergraduate extends Student
{
private String specialty;

	public Undergraduate(String n1, int a1, String d1, String specialty){
	super(n1, a1, d1);
	this.specialty = specialty;
}

	public void show()
	{
		super.show();
		System.out.println(specialty);
	}
	}

class Graduate extends Student
{
	String direction;
	
	public Graduate(String n1, int a1, String d1, String direction) {
		super(n1, a1, d1);
		this.direction = direction;
	}

	public void show()
	{
		super.show();
		System.out.println(direction);
	}
	}

public class e1 {
	public static void main(String args[])
	{
		Student s = new Student("张1",20,"普通");
		s.show();
		Undergraduate u = new Undergraduate("陈定",21,"本科生","专业计算机");
		Graduate g = new Graduate("李生",26,"研究生","研究方向信息管理");
		u.show();
		g.show();
		
	}

}
