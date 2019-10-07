package state_pattern;

public class VendingMachine {
    private int productCount;
    private State currentState = null;

    private State idleState = new IdleState();
    private State hasMoneyState = new HasMoneyState();
    private State outOfStockState = new OutOfStockState();

    VendingMachine(int productCount) {
        this.productCount = productCount;
        if (productCount > 0) setIdleState();
        else setOutOfStockState();
    }

    void setIdleState() {
        this.currentState = idleState;
    }

    void setHasMoneyState() {
        this.currentState = hasMoneyState;
    }

    void setOutOfStockState() {
        this.currentState = outOfStockState;
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
