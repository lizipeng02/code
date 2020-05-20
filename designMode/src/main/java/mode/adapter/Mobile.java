package mode.adapter;

/**
 * 介绍：Client类：手机 .需要5V电压
 * 作者：zhangxutong
 * 邮箱：zhangxutong@imcoming.com
 * 时间： 2016/10/18.
 */

public class Mobile {
    /**
     * 充电方法
     *
     * @param voltage5
     */
    public void charging(Voltage5 voltage5) {
        if (voltage5.output5V() == 5) {
            System.out.println("电压刚刚好5V，开始充电");
        } else if (voltage5.output5V() > 5) {
            System.out.println("电压超过5V，都闪开 我要变成note7了");
        }
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        //类适配器 一旦适配的对象生成，就决定了它的功能，
        //mobile.charging(new VoltageAdapter());
        //对象适配器 好处，符合合成服用的原则，
        // 好处：我的理解：可以解决兼容的问题，这个对象可以解决原先的问题，适配后也可以解决现在的问题
        // 一般我们在项目中被适配的对象是已经存在的，那么我们为什么不直接拿来使用呢
        mobile.charging(new VoltageAdapter2(new Voltage220()));
    }
}