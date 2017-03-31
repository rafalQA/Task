import com.task.FirstTask;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rpiotrowicz on 2017-03-31.
 */
public class FirstTaskTest {


    private List<Double> inNumbers;
    private List<Double> expectedNumbers;
    private FirstTask firstTask;


    @Before
    public void init() {
        this.inNumbers = Arrays.asList(1d, 9d, 8d, 7d, 20d, 6d, 50d, 60d, -4d, 0d, -16d);
        this.expectedNumbers = Arrays.asList(1d, 49d, 36d, 16d, 0d);
        this.firstTask = new FirstTask();
    }

    @Test
    public void testGetNaturalNumbersExponentsLessThan64() {
        List<Double> actualExponents = firstTask.getNaturalNumbersExponentsLessThan64(inNumbers);

        Assert.assertEquals(expectedNumbers, actualExponents);
    }

    @Test
    public void testGetNaturalNumbersExponentsLessThan64HighPerformence() {
        List<Double> actualExponents = firstTask.getNaturalNumbersExponentsLessThan64HighPerformence(inNumbers);

        Assert.assertEquals(expectedNumbers, actualExponents);
    }
}
