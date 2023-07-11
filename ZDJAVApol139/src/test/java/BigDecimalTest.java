import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    static int i = 0;
    int j = 1;

    {
        System.out.println("j= " + j);
    }
    static {
        System.out.println("i= " + i);
    }
    static {
        i = i++;
    }
    @Test
    void test() {

        BigDecimal bigDecimalUsingNewOperator = new BigDecimal(150.000012345678);
        BigDecimal bigDecimalUsingStaticMethod = BigDecimal.valueOf(150.000012345678);

        {

        }
   ;

        System.out.println("new BigDecimal:");
        System.out.println(bigDecimalUsingNewOperator);
        System.out.println("--------------------------------");
        System.out.println("BigDecimal using valueOf static method:");
        System.out.println(bigDecimalUsingStaticMethod);

    }
}
