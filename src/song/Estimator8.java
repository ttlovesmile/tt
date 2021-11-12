package song;

 interface CompurerAverage {  //接口
	   public double average(double x[]);
	}
 class SongGame implements CompurerAverage {
	   public double average(double x[]) {
	      int count=x.length;
	      double aver=0,temp=0;
	      for(int i=0;i<count;i++) {
	         for(int j=i;j<count;j++) {
	            if(x[j]<x[i]) {
	              temp=x[j];
	              x[j]=x[i];
	              x[i]=temp;  
	            } 
	         }
	      }
	      for(int i=1;i<count-1;i++) {
	         aver=aver+x[i];
	      }
	      if(count>2)
	         aver=aver/(count-2);
	      else
	         aver=0;
	      return aver;
	   }
	}
 class School implements CompurerAverage {
	public double average(double x[])
	{
		int count = x.length;
		int sum = 0;
		for(int i = 0; i < count;i++)
		{
			sum +=x[i];
			
		}
		
		return(sum/count);	
	
	}
		//重写public double average(double x[])方法,返回数组x[]的元素的算术平均
	}
	
public class Estimator8{    //主类
	   public static void main(String args[]) {
	      double a[] = {9.89,9.88,9.99,9.12,9.69,9.76,8.97};
	      double b[] ={56,55.5,65,50,51.5,53.6,70,49,66,62,46};  
	      CompurerAverage computer;
	      computer=new SongGame();  
	      double result= computer.average(a);//computer调用average(double x[])方法，将数组a传递给参数x
	      System.out.printf("%n");
	      System.out.printf("歌手最后得分:%5.3f\n",result);
	      computer=new School();  
	      result=computer.average(b); //computer调用average(double x[])方法，将数组b传递给参数x
	      System.out.printf("学生平均体重:%-5.2f kg",result);
	   } 
	}

 