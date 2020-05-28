package thread.demo1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * 罐子
 * */
public class Box {

    //定义管子容量的最大值为30
    public static int MAX = 30 ;
    //定义当前管子的容量
    private int size = 0 ;

    /**
     * 添加蜂蜜方法
     */
    public synchronized void add(int cap) {
        //判断添加的蜂蜜是否会使得管子变满
        if (cap > (MAX - size)) {
            //获取添加蜂蜜多出的量
            int remain = cap + size - MAX;
            //如果添加的密封会是管子溢出的话，我们直接把罐子加满即可！
            size = MAX;
            System.out.println("生产了" + (MAX - size) + "蜂蜜");
            //加满罐子后通知其他线程来消费,并让当前线程进入等待队列
            this.notifyAll();
            try {
                this.wait();
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //如果当前线程被唤醒后，我们需要将之前剩余量继续进行添加操作！
            add(remain);
            
        }
        //如果当前的蜂蜜不能使罐子盛满，我们就直接添加蜂蜜即可！
            size += cap;
            System.out.println("生产了" + cap + "蜂蜜");
        //加完之后需要通知其他线程
        this.notifyAll();
    }

    /**
     * 清空罐子
     */
    public synchronized int clear(){
        while(size < 20){
            this.notifyAll();
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int temp = size ;
        size = 0 ;
        return temp ;
    }
}
