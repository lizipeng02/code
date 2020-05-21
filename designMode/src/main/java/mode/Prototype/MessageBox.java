package mode.Prototype;

import javax.sound.midi.Soundbank;

/*
 * MessageBox类（ConcreteProtorype）
 * */
public class MessageBox implements Product {
    //保存的是装饰方框使用的字符样式
    private char decochar;
    //假如持有其它对象的引用，测试浅拷贝和深拷贝的区别
    private OtherObj otherObj;


    public OtherObj getOtherObj() {
        return otherObj;
    }

    public void setOtherObj(OtherObj otherObj) {
        this.otherObj = otherObj;
    }

    public MessageBox(char decochar, OtherObj otherObj) {
        this.decochar = decochar;
        //增加其它对象测试浅拷贝和深拷贝
        this.otherObj = otherObj;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    //该方法用于复制自己
    @Override
    public Product creatClone(Boolean deep) {
        Product p = null;
        try {
            MessageBox m = (MessageBox) clone();
            if (!deep) {
                p = (Product) m;
            } else {
                OtherObj oo = (OtherObj) otherObj.clone();
                m.setOtherObj(oo);
            }
            System.out.println(m == this);
            System.out.println(m.otherObj == otherObj);
            System.out.println(this.toString());
            System.out.println(m.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }


}

