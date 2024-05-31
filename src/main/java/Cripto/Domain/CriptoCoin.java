package Cripto.Domain;

public interface CriptoCoin {
    int applyFluctuation(double fluctuation);
    int calculateCurrentValue();
    int calculateFutureValue(double value);
}
