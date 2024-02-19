import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlgorithmsIterativeTest {
    private AlgorithmsIterative algorithms;

    @BeforeEach
    public void beforeEach() {
        algorithms = new AlgorithmsIterative();
    }

    @Test
    void testIterativeMetodForFabionacciNumber() {
        int actual = algorithms.iterativeMetodForFabionacciNumber(6);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

}
