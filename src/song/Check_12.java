package song;
 class Goods {
	   boolean isDanger;
	   String name;
	   public void setIsDanger(boolean boo) {
	      isDanger = boo;
	   }
	   public boolean isDanger() {
	      return isDanger;  
	   }
	   public void setName(String s) {
	      name = s;
	   }
	   public String getName() {
	      return name;
	   }
	}

 class DangerException extends Exception {
	   String message;
	   public DangerException() {
	       message = "危险品!";
	   }
	   public void toShow() {
	       System.out.print(message+" ");
	   }
	}
 
 
  class Machine {
 	public void checkBag (Goods goods) throws DangerException {
 		if(goods.isDanger()){
 			DangerException danger=new DangerException();
 			throw danger;
 		}
 		else{
 			System.out.print(goods.getName()+"不是危险品!");
 		}
 	}
  
 }
public class Check_12{
	   public static void main(String args[]) {
	      Machine machine = new Machine();
	      String name[] ={"苹果","炸药","西服","硫酸","手表","硫磺"};
	      Goods [] goods = new Goods[name.length]; //检查6件物品  
	      for(int i= 0;i<name.length;i++) {
	         goods[i] = new Goods();
	         if(i%2==0) {
	            goods[i].setIsDanger(false);
	            goods[i].setName(name[i]);
	         }
	         else {
	            goods[i].setIsDanger(true);
	            goods[i].setName(name[i]);
	         } 
	      }
	      for(int i= 0;i<goods.length;i++) {
	        try { machine.checkBag(goods[i]);
	            System.out.println(goods[i].getName()+"检查通过");
	        }
	        catch(DangerException e) {
	          e.toShow(); //e调用toShow()方法
	            System.out.println(goods[i].getName()+"被禁止!"); 
	        }
	      }     
	   } 
	}


