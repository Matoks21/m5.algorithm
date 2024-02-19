import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlgorithmRecursiveTest {

    private AlgorithmsRecursive algorithms;

    @BeforeEach
    public void beforeEach() {
        algorithms=new AlgorithmsRecursive();
    }

    @Test
    void testRecursiveMetodForFabionacciNumber() {
        int actual = algorithms.recursiveMetodForFabionacciNumber(6);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

}
