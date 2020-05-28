package thread.demo2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 篮子,100个馒头
 */
class Basket {
    //馒头数量==编号
    private int count = 100;
    //和尚数量 ==没吃馒头的和尚数量
    private int numMonks = 30;

    /**
     * 获取馒头的方法，返回馒头的编号
     */
    public synchronized int getBread(Monk monk) {
        //和尚第一次吃
        if (monk.count == 0) {
            int temp = count;
            count--;
            numMonks--;
            return temp;
        }
        //和尚还可以吃的情况
        else if (monk.count < Monk.MAX) {
            //判断是否有多余的馒头
            if (count > numMonks) {
                int temp = count;
                count--;
                return temp;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
