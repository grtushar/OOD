package chain_of_responsibility;

public interface Dispenser {
    void setNext(Dispenser next);

    void dispense(Amount amount);
}
