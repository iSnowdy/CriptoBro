package Cripto.Build;

import Cripto.Domain.Bitcoin;
import Cripto.Domain.Coin;
import Cripto.Domain.Ethereum;

import java.util.HashSet;


public class CriptoBro {
    public static void main(String[] args) {
        HashSet<Coin> coins = new HashSet<>();

        Bitcoin bitcoin1 = new Bitcoin(2451, 2);
        Ethereum ethereum1 = new Ethereum(412, 2);
        Ethereum ethereum2 = new Ethereum(21, 0);

        System.out.println("Global ID: " + Coin.globalID);

        System.out.println("\n");

        coins.add(bitcoin1);
        coins.add(ethereum1);
        coins.add(ethereum2);
        // We check if a dupe can be inserted
        // coins.add(ethereum2);

        for (Coin a : coins) {
            System.out.println(a.print());
        }

        System.out.println();

        System.out.println("Current Value: " + bitcoin1.calculateCurrentValue() + ", BitCoin ID: " + bitcoin1.getId());
        System.out.println("Current Value: " + ethereum1.calculateCurrentValue()  + ", Ethereum ID: " + ethereum1.getId());
        System.out.println("Current Value: " + ethereum2.calculateCurrentValue()  + ", Ethereum ID: " + ethereum2.getId());

        System.out.println();

        System.out.println("After Fluctuation of BitCoin ID " + bitcoin1.getId() + ": " + bitcoin1.applyFluctuation(0.2));
        System.out.println("After Fluctuation of Ethereum ID " + ethereum1.getId() + ": " + ethereum1.applyFluctuation(0.2));
        System.out.println("After Fluctuation of Ethereum ID " + ethereum2.getId() + ": " + ethereum2.applyFluctuation(0.2));

        System.out.println();

        System.out.println("After Fluctuation of BitCoin ID " + bitcoin1.getId() + ": " + bitcoin1.applyFluctuation(-0.9));
        System.out.println("After Fluctuation of Ethereum ID " + ethereum1.getId() + ": " + ethereum1.applyFluctuation(-0.9));
        System.out.println("After Fluctuation of Ethereum ID " + ethereum2.getId() + ": " + ethereum2.applyFluctuation(-0.9));
    }
}
