package song;

interface Homeletter {
//	写题目的方法
	void Hometitle();
//	写问候语的方法
	void Homegreet();
//	写内容的法方法
	void Homecontent();
//	结语的方法
	void Homesign();
//	名字日期的方法
	void Homebless();
}
 class Home  {
		// TODO Auto-generated constructor stub
	
//
	public static void show(Homelett le) {
		
   le.Hometitle();
   le.Homegreet();
   le.Homecontent();
   le.Homesign();
   le.Homebless();
	}
}
 public class Letter10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建家书对象，上转型构建
 Homelett h = new Homelett();
// 写家书
 Home.show( h);
	}

}
  class Homelett implements Homeletter {

	@Override
	public void Hometitle() {
		// TODO Auto-generated method stub
		System.out.println("亲爱的爸爸、妈妈："); 
	}

	@Override
	public void Homegreet() {
		// TODO Auto-generated method stub
		
		System.out.println("  你们好呀！\n"); 
	}

	@Override
	public void Homecontent() {
		// TODO Auto-generated method stub
		System.out.println("  我在这里挺好的。\n  我会努力学习的，我已经学习到Java oop啦！\n  您二老 保重身体啊！\n");
	}

	@Override
	public void Homesign() {
		// TODO Auto-generated method stub
		System.out.println("  此致\n敬礼");
	}

	@Override
	public void Homebless() {
		// TODO Auto-generated method stub
		System.out.println("\t      周杰\n\t2021.11.11");
	}
	
}
