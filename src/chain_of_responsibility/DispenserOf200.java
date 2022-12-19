package chain_of_responsibility;

public class DispenserOf200 extends BaseDispenser {
    private static int TWO_HUNDRED = 200;

    @Override
    public void dispense(Amount amount) {
        if (amount.getAmount() > TWO_HUNDRED) {
            int numOfNotes = amount.getAmount() / TWO_HUNDRED;
            int rem = amount.getAmount() % TWO_HUNDRED;

            System.out.println("Dispensing " + numOfNotes + " " + TWO_HUNDRED + " notes");
            if(rem > 0) this.chain.dispense(new Amount(rem));
        } else {
            this.chain.dispense(amount);
        }
    }
}
