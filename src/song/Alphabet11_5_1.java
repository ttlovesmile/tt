package song;

class  A{
	
	public void printEnglish()
	{
		int firstEnglish, lastEnglish;
		char firstE = 'A', lastE = 'Z';      //获取首字母与末字母的值
		
		firstEnglish = (int)firstE;
		lastEnglish = (int)lastE;
		
		System.out.println("英文字母表： ");
		for(int i = firstEnglish; i <= lastEnglish; ++i)
		{
			char uppercase, lowercase; 
			
			uppercase = (char)i;
			lowercase = (char)(i + 32);
			
			System.out.print(" " + uppercase + lowercase);
		}
		
		System.out.println();
	}
 
}

 class B extends A {
	
	public void printGreek()
	{
		int firstLetter, lastLetter;
		char firstG = 'α', lastG = 'ω';      //获取首字母与末字母的值
		
		firstLetter = (int)firstG;
		lastLetter = (int)lastG;
		
		System.out.println("希腊字母表： ");
		for(int i = firstLetter; i <= lastLetter; ++i)
		{
			char greekLetter;
			
			greekLetter = (char)i;
			
			System.out.print(" "+greekLetter);
		}
		
		System.out.println();
	}
}
 public class Alphabet11_5_1 {
	 
		
		public static void main(String[] args){
			
			A e = new A();
			B g = new B();
			
			e.printEnglish();
			g.printGreek();
			g.printEnglish();
		}
	 
	}

