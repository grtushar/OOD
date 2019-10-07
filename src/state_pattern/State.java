package state_pattern;

public interface State {
    void insertDollar(VendingMachine vendingMachine); // insert money for product
    void ejectMoney(VendingMachine vendingMachine); // get money back
    void dispense(VendingMachine vendingMachine);   // get product
}
