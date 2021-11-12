package work;
import java.io.PrintStream;
import java.util.Scanner;
class Animal {
	String animal="";
   public void Animal(String animal){

	this.animal = animal;

	}
	public String getanimal()
	{
		return animal;
	}

}
 class Dog extends Animal
{
	String color;
public void sound(String color)
{
	this.color= color;
	
	}
public String getsound()
{
	return color;
}

}

 class Cat extends Animal{
		String color;
		
		public Cat() {}
	public void sound(String color)
	{
		this.color= color;
		
		}
	public String getsound()
	{
		return color;
	}

	}
public class AnimalDemo {

	public static void main(String[] ages)throws Exception{
		Scanner scan=new Scanner(System.in,"UTF-8");
		PrintStream out =new PrintStream(System.out,true,"UTF-8");
		Dog dog = new Dog();
		Cat c = new Cat();
		String dog1 ="狗"; 
		String cat2 = "猫";
		dog.Animal(dog1);
		c.Animal(cat2);
		dog.sound("红色");
		c.sound("黑色");
		out.println("我的宠物:"+dog.getanimal()+"  颜色:"+dog.getsound());
		out.println("我的宠物:"+c.getanimal()+"  颜色:"+c.getsound());
	}
}




