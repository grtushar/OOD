package state_pattern;

public class OutOfStockState implements State {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Out of stock!");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Out of stock!");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of stock!");
    }
}
