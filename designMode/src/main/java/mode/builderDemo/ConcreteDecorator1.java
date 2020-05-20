package mode.builderDemo;

//具体建造者：具体装修工人1
class ConcreteDecorator1 extends Decorator {

    public void buildWall() {
        product.setWall("w1");
    }

}
