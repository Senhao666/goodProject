import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestCalc {
    @Test
    void test(){
        Calc calc = new Calc();
        Assertions.assertEquals(5,calc.add(3,2));
        Assertions.assertEquals(1,calc.subtract(3,2));
    }
}
