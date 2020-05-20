package mode.builderDemo;

//抽象建造者：装修工人
abstract class Decorator {
    //创建产品对象
    protected Parlour product = new Parlour();

    public abstract void buildWall();

    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}
