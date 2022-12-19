package chain_of_responsibility;

public abstract class BaseDispenser implements Dispenser {
    protected Dispenser chain;

    @Override
    public void setNext(Dispenser next) {
        this.chain = next;
    }
}
