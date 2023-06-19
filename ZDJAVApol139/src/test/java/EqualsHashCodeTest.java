import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.ZDJAVApol139.cat.Cat;

public class EqualsHashCodeTest {

    @Test
    void test(){

        Cat cat = new Cat("Andrzejek");
        Cat cat1 = new Cat("Andrzejek");

        System.out.println(cat);
        System.out.println(cat1);

        int i = 1;
        int j = 1;

        System.out.println(i == j);
        System.out.println(cat == cat1);
        System.out.println(cat.equals(cat1));


    }
}
