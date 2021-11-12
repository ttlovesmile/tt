package work2;
import java.util.Scanner;
public class JavaSy0401 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	People people = new People(sc.next(),sc.nextInt());
	Boy boy =new Boy(sc.next(),sc.nextInt());
	Girl girl = new Girl(sc.next(),sc.nextInt());
	people.speak();
	boy.speak();
	girl.speak();
	sc.close();
	}
}
class People
{
	public  String name ;
	public int age;
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void speak()
	{
		System.out.println("my name is "+name+",I am "+age+" years old."  );
	}
	
	}
class Boy extends People
{
// String name;
// int age;
	
	public Boy(String name, int age) {
		super(name, age);
		
		
	}
	void speak()
	{
		System.out.println("I am a boy,I am "+age+" years old.");
	}
	
	}
class Girl extends People
{
//   String name;
	public Girl(String name, int age) {
		super(name, age);
		
		
	}
	void speak(){
	System.out.println("I am a girl,my name is "+name+".");}
	}