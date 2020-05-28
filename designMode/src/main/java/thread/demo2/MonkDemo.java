package thread.demo2;
/**
 * 和尚吃馒头问题
 */
public class MonkDemo {
    public static void main(String[] args) {
        Basket b = new Basket();
        for(int i = 0 ; i < 30 ; i ++){
            new Monk(b , "和尚" + (i+1)+":\t").start();
        }
    }
}
