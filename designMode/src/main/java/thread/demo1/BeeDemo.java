package thread.demo1;

import java.util.concurrent.CountDownLatch;

public class BeeDemo {
    public static void main(String[] args) {
        Box box = new Box();
        Bear b1 = new Bear(box , "熊大"  );
        Bear b2 = new Bear(box , "熊二" );
        b1.start();
        b2.start();
        for(int i = 1 ; i <= 10 ; i ++){
            new Bee("Bee" + i ,box).start();
        }
    }
}
