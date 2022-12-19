package chain_of_responsibility;

public class DispenserOf100 extends BaseDispenser {
    private static int HUNDRED = 100;

    @Override
    public void dispense(Amount amount) {
        int numOfNotes = amount.getAmount() / HUNDRED;
        System.out.println("Dispensing " + numOfNotes + " " + HUNDRED + " notes");
    }
}
