package mode.bridge;

public class Client {

    public static void main(String[] args) {
        Implementor imp = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imp);
        abs.request();
    }

}