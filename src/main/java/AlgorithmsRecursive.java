/*
Просторова складність -лінійна О(n)
Часова складність - експоненційнa O(2^n)
 */
public class AlgorithmsRecursive {

    public int recursiveMetodForFabionacciNumber(int n) {
        numberIsNatural(n);
        if (n <= 1) {
            return n;
        } else
            return recursiveMetodForFabionacciNumber(n - 2) + recursiveMetodForFabionacciNumber(n - 1);
    }

    private void numberIsNatural(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be natural");
        }
    }
}
