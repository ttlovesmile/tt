package song;
import java.util.Scanner;
public class Judgment_Anomaly_14 {

	public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 Person person = new Person();
 System.out.println("请输入姓名：");
 person.setName(sc.next());
 System.out.println(person.getName());
 
System.out.println("请输入年龄：");
 try
 {person.setAge(sc.nextInt());
 System.out.println(person.getAge());
 }catch(Exception e) {
	 e.printStackTrace();
 }
 System.out.println("请输入性别：");
 try
 {person.setSex(sc.next());
 System.out.println(person.getSex());
 }catch(Exception e) {
	 e.printStackTrace();
 }
 
 person.talk();
 sc.close();
	}
}

class Person
{
     String name;
	 int age;
	 String sex;
public void setAge(int age) throws Exception
	{
		
			if(age > 1 && age <100)
			{	this.age = age;
			}
			else {
	
				throw new Exception("年龄必须在1到100之间！");
			}		
			}
				
		
	
	public void setSex(String sex) throws Exception
	{
		if("男".equals(sex) || "女".equals(sex))
				this.sex = sex;
		
		
		else {
			throw new Exception("性别必须是“男”或者“女”!");
			}
		}
	
	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getSex() {
		return sex;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	void talk()
	{
		
	}
	}
	
