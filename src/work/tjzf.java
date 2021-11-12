/**
 * 缂栧啓绋嬪簭锛屼粠瀛楃涓测�渨ant you to know one thing鈥濅腑缁熻鍑哄瓧姣嶁�渘鈥濈殑鍑虹幇娆℃暟銆�
 * 銆愯緭鍏ュ舰寮忋��
銆愯緭鍑哄舰寮忋��
銆愭牱渚嬭緭鍏ャ��
銆愭牱渚嬭緭鍑恒��

瀛楁瘝n鐨勫嚭鐜版鏁帮細*/
package work;

public class tjzf {

	public static void main(String[] args) {
   String sb = "want you to know one thing";
   int j = 0;

   for(int i = 0;i < sb.length();i++) {
	   char s = sb.charAt(i);
	   if(s == 'n') {
		   j++;
	   }
   }
   System.out.println("瀛楁瘝n鐨勫嚭鐜版鏁�:"+j);
	}

}

