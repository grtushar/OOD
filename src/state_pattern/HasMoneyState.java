package state_pattern;

public class HasMoneyState implements State {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Already has money. Rejecting operation!");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("Giving money back!");
        vendingMachine.setIdleState();
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        if (vendingMachine.getProductCount() > 0) {
            System.out.println("Giving product!");
            vendingMachine.setProductCount(vendingMachine.getProductCount() - 1);
            vendingMachine.setIdleState();
        } else {
            ejectMoney(vendingMachine);
            vendingMachine.setOutOfStockState();
        }
    }
}
