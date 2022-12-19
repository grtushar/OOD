package chain_of_responsibility;

public class ATM {
    private Dispenser dispenserOf500;

    public ATM() {
        this.dispenserOf500 = new DispenserOf500();
        Dispenser dispenserOf200 = new DispenserOf200();
        Dispenser dispenserOf100 = new DispenserOf100();

        dispenserOf500.setNext(dispenserOf200);
        dispenserOf200.setNext(dispenserOf100);
    }

    public void dispense(Amount amount) {
        this.dispenserOf500.dispense(amount);
    }
}
