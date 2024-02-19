import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlgorithmDynamicProgTest {

    private AlgorithmsDynamicProg algorithms;

    @BeforeEach
    public void beforeEach() {
        algorithms = new AlgorithmsDynamicProg();
    }


    @Test
    void testDynamicProgMetodForFabionacciNumber() {
        int actual = algorithms.dynamicProgMetodForFabionacciNumber(6);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
}
