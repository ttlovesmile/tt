package song;

 interface WeatherState {   //接口
    public void showState();
}
 class Weather {
	   WeatherState  state;
	   public void show() {
	      state.showState();
	   }
	   public void setState(WeatherState s) {
	      state = s;
	   }
	}
public class WeatherForecast9 {  //主类
	   public static void main(String args[]) {
	      Weather weatherBeijing =new Weather();
	      System.out.print("\n今天白天:");
	      weatherBeijing.setState(new CloudyDayState());
	      weatherBeijing.show();
	      System.out.print("\n今天夜间:");
	      weatherBeijing.setState(new LightRainState());
	      weatherBeijing.show();
	      System.out.print("转:");
	      weatherBeijing.setState(new HeavyRainState());
	      weatherBeijing.show();
	      System.out.print("\n明天白天:");
	      weatherBeijing.setState(new LightRainState());
	      weatherBeijing.show();
	      System.out.print("\n明天夜间:");
	      weatherBeijing.setState(new CloudyLittleState());
	      weatherBeijing.show();
	   }
	}
 class CloudyLittleState implements WeatherState {
    public void showState() {
       System.out.print("少云,有时晴.");
    }
}
 class CloudyDayState implements WeatherState {
	 public void showState()
	 {
		 System.out.print("少云,有时雨.");
	 }//重写public void showState()
}
 class HeavyRainState implements WeatherState{
	 public void showState()
	 {
		 System.out.print("多云,有时雨.");
	 }//重写public void showState()
}
 class LightRainState implements WeatherState {
	 public void showState()
	 {
		 System.out.print("多云,有时阴.");
	 }//重写public void showState()方法
}
