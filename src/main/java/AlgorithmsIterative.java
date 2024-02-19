/*
Просторова складність- константна O(1)
Часова складність - лінійна O(n)
 */

public class AlgorithmsIterative {

    public int iterativeMetodForFabionacciNumber(int n) {
        numberIsNatural(n);
        int fabionacci0 = 0;
        int fabionacci1 = 1;
        if (n == 0) {
            return fabionacci0;
        }
        for (int i = 2; i <= n; i++) {
            int fabionacci = fabionacci0 + fabionacci1;
            fabionacci0 = fabionacci1;
            fabionacci1 = fabionacci;
        }
        return fabionacci1;
    }

    private void numberIsNatural(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be natural");
        }
    }

}