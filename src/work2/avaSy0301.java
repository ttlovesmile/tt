package work2;
import java.util.Scanner;
//编号，名称，单价，数量,  出版社,  作者
public class avaSy0301 {
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int num=sc.nextInt();
		String name=sc.next();
		double price =sc.nextDouble();
		int number=sc.nextInt();
		String press=sc.next();
		String author=sc.next();
		Book book = new Book(num,name,price,number,press,author);
		System.out.println("id:"+book.getNum());
		System.out.println("name:"+book.getName());
		System.out.println("price:"+book.getPrice());
		System.out.println("num:"+book.getNumber());
		System.out.println("press:"+book.getPress());
		System.out.println("author:"+book.getAuthor());
		Book2 book2 = new Book2();
		System.out.println(book2.getInfo());
		
		
sc.close();		
	}

}


class Book
{
	private int num;
	private String name;
	private double price;
	private int number;
	private String press;
	private String author;
	
	public Book(int num, String name, double price, int number, String press, String author) {
	
		this.num = num;
		this.name = name;
		this.price = price;
		this.number = number;
		this.press = press;
		this.author = author;
	
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getNumber() {
		return number;
	}

	public String getPress() {
		return press;
	}

	public String getAuthor() {
		return author;
	}
}
class Book2{
		private int id;
		private String name;
		private float price;
		private int num;
		private String press;
		private String author;
		public Book2(){
			this.id = id;
			 this.name = name;
			 this.price = price;
			 this.num = num;
			 this.press = press;
			 this.author = author;
		}
		public String getInfo() {
			return "id:"+id+"\n"+"name:"+name+"\n"+"price:"+price+"\n"+"num:"+num+"\n"+"press:"+press+"\n"+"author:"+author+"\n";
		}
	}

	


	
	
