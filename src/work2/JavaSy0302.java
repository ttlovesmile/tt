package work2;
import java.util.*;
//y%4==0 && y%100!=0) || (y%400==0)
public class JavaSy0302 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Date date = new Date();
	date.setyear(sc.nextInt());
	date.setmonth(sc.nextInt());
	date.setday(sc.nextInt());
	date.show();
	sc.close();
	
}
}
class Date{
	private int year;
	private int month;
	private int day;
	
	int getyear() {
		return year;
	}
	void setyear(int year) {
		this.year = year;
	}
	int getmonth() {
		return month;
	}
	void setmonth(int month) {
		if(month >= 0 && month <= 12) {
		this.month = month;}else {
			this.month = -1;
		}

		
	}
	int getday() {
		return day;
	}
	void setday(int day) {
		if(month == -1) {
			this.day = -1;
		}else if((year % 4 == 0 && year % 100 != 0|| year%400 ==0 )&& day ==29) {
			this.day = 29;
		}
		else if(month==4|month==6|month==9|month==11&&(day >= 0) && (day <= 30)) {			
			this.day = day;}
		else if(month==1|month==3|month==5|month==7|month==8|month==12|month==10&&(day >= 0) && (day <= 31)) {			
		this.day = day;}else{
			this.day = -1;
		}
		
	}
	void show() {
		System.out.println(year+"/"+month+"/"+day);
	}
}

	
