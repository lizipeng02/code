package mode.stragegy2;

public class CashContext {

    private CashSuper cashSuper;
    private double money;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
