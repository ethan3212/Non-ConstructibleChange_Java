package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        System.out.println(nonConstructibleChange(coins));
    }

    // O(nLog(n)) time | O(1) space
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);     // O(nLog(n)) time
        int amountOfChangeWeCanMake = 0;
        for(int coinDenomination : coins) {     // O(n) time
            if(coinDenomination > amountOfChangeWeCanMake + 1) {
                break;
            }
            amountOfChangeWeCanMake += coinDenomination;
        }
        return amountOfChangeWeCanMake + 1;
    }
}