package Cripto.Domain;

public class Ethereum extends Coin {
    private int contractNumber;
    private int id;
    private static int internalID;

    public Ethereum(int currentValue) {
        super(currentValue);
    }
    public Ethereum(int currentValue, int contractNumber) {
        super(currentValue);
        this.contractNumber = contractNumber;

        internalIDIncreaser();
        this.id = internalID;
        System.out.println("The Ethereum Coin has been successfully created. The ID number is: " + this.id);
    }

    private static void internalIDIncreaser() {
        internalID ++;
    }

    @Override
    public String print() {
        String output =
                "Ethereum Information:\n" +
                "Ethereum Value: " + super.getCurrentValue() + "\n" +
                "Ethereum ID: " + this.id + "\n" +
                "Contract Number: " + getContractNumber() + "\n";
        return output;
    }

    /*@Override
    public String toString() {
        String output =
                "Ethereum Information:\n" +
                 super.toString() + "\n" +
                "Ethereum ID: " + this.id + "\n" +
                "Nodes Number: " + getContractNumber() + "\n";
        return output;
    }*/

    // Interface Methods

    @Override
    public int applyFluctuation(double fluctuation) {
        this.setCurrentValue((int) (calculateCurrentValue() * (1 + fluctuation)));
        return this.getCurrentValue();
    }
    @Override
    public int calculateCurrentValue() {
        return Math.abs(getCurrentValue());
    }
    @Override
    public int calculateFutureValue(double value) {
        int futureValue = (int) (this.getCurrentValue() * value);
        return futureValue;
    }

    // Getters and Setters

    public int getContractNumber() {
        return contractNumber;
    }
    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
