package Objects;

import Emloyees.Waiter;

public class Table {

    public int number;
    private int size;
    public Waiter waiter;

    public Table(int number, int size) {
        this.number = number;
        this.size = size;
    }

    public void setWaiter(Waiter waiter) {
        addWaiter(waiter);
    }

    private void addWaiter(Waiter waiter) {
        if (this.waiter != null) {
            this.waiter = waiter;
        }
    }

    @Override
    public String toString() {
        return "Table{" +
                "number=" + number +
                ", size=" + size +
                '}';
    }
}
