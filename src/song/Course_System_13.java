package song;
//按照控制台提示输入1～3之间任一个数字，程序将输出相应的课程名称
//根据键盘输入进行判断。如果输入正确，输出对应课程名称。
//如果输入错误，给出错误提示；不管输入是否正确，均输出“欢迎提出建议”语句。
//（假设1为C#编程，2为Java程序设计，3为C语言程序设计）
import java.util.Scanner;
public class Course_System_13 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("请输入课程代号（1~3之间的数字：");
	Suggestions suggestion = new Suggestions(sc.nextInt());
	suggestion.judgmentnum();
	suggestion.Thanks_for_the_advice();
	sc.close();
	
	}
}
class Suggestions
{
	int num;

	public Suggestions(int num) {
		this.num = num;
	}
 public void judgmentnum()
	{
	try {	
	 switch(num)
		{
		case 1: System.out.println("C#编程");
		case 2: System.out.println("Java程序设计");
		case 3: System.out.println("C语言程序设计");
		
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
 public void Thanks_for_the_advice()
 {
	 System.out.println("欢迎提出建议！");
 }
	}