package mode.facdePattern3;
/*
* 创建一个实现了 Cloneable 接口的抽象类
* 内部状态，即不会随着环境的改变而改变的可共享部分；
* 外部状态，指随环境改变而改变的不可以共享的部分。
* 享元模式的实现要领就是区分应用中的这两种状态，并将外部状态外部化。
* */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
