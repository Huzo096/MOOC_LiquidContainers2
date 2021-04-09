

public class Container {

    private int amountOfLiquid;


    public Container() {
        this.amountOfLiquid = 0;

    }

    public int contains() {
        return this.amountOfLiquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amountOfLiquid += amount;
            if (this.amountOfLiquid > 100) {
                this.amountOfLiquid = 100;
            }
        }
    }

    public void remove(int amount) {

        if (amount > 0) {
            this.amountOfLiquid -= amount;
            if (this.amountOfLiquid < 0) {
                this.amountOfLiquid = 0;
            }
        }
    }



    public String toString() {
        return this.amountOfLiquid + "/100";
    }

}