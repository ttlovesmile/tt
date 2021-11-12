package work2;

public class Doorimpl extends Door implements Alarm{
    @Override
    public void alarm() {
        System.out.println("美心防盗门报警：请注意，有盗贼进入");
        System.out.println("火灾报警器报警：有大量烟雾，请注意防火");
    }

    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }
}
