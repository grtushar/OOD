package chain_of_responsibility;

public class DispenserOf500 extends BaseDispenser {
    private static int FIVE_HUNDRED = 500;

    @Override
    public void dispense(Amount amount) {
        if (amount.getAmount() > FIVE_HUNDRED) {
            int numOfNotes = amount.getAmount() / FIVE_HUNDRED;
            int rem = amount.getAmount() % FIVE_HUNDRED;

            System.out.println("Dispensing " + numOfNotes + " " + FIVE_HUNDRED + " notes");
            if(rem > 0) this.chain.dispense(new Amount(rem));
        } else {
            this.chain.dispense(amount);
        }
    }
}
