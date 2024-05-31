package Cripto.Domain;

public abstract class Coin implements CriptoCoin {
    private int currentValue;
    public static int globalID;

    public Coin(int currentValue) {
        this.currentValue = setCurrentValue(currentValue);
        increaseCounter();
    }

    private static void increaseCounter() {
        globalID ++;
    }

    public abstract String print();

    /*@Override
    public String toString() {
        String output =
                "This Coin value is currently at: " + getCurrentValue();
        return output;
    }*/

    // Getters and Setters
    public int getCurrentValue() {
        return currentValue;
    }
    public int setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        return this.currentValue;
    }
}