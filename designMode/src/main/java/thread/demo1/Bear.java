package thread.demo1;

import java.util.concurrent.CountDownLatch;

/**
 * 消费者
 */
class Bear extends Thread {
    private String bearName;
    private Box box;

    public Bear(Box box, String name) {
        this.bearName = name;
        this.box = box;
    }

    public void run() {
        while (true) {
            int size = box.clear();
            System.out.println(bearName + " 吃了【" + size + "】个蜂蜜");
        }
    }
}
