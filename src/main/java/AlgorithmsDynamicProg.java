import java.util.ArrayList;
import java.util.List;
/*
Просторова складність - лінійна O(n)
Часова складність - лінійна O(n)
 */
public class AlgorithmsDynamicProg {

    public int dynamicProgMetodForFabionacciNumber(int n) {
        numberIsNatural(n);
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i <= n; i++) {
            int fabionacci = list.get(i - 1) + list.get(i - 2);
            list.add(fabionacci);
        }

        return list.get(n);
    }

    private void numberIsNatural(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be natural");
        }
    }
}
