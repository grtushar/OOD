package state_pattern;

public class IdleState implements State {
    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        vendingMachine.setHasMoneyState();
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return!");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Payment required!");
    }
}
