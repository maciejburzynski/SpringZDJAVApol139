import org.junit.jupiter.api.Test;
import pl.sda.ZDJAVApol139.dog.Dog;
import pl.sda.ZDJAVApol139.utils.ShelterUtils;

public class ShelterUtilsTest {


    @Test
    void canWeChangeUtilsFieldsIfFinal() {

        final Integer exampleInteger = 1500;
//        exampleInteger = 1200;
//       impossible
        final String exampleString = "Hello Byku";
//        exampleString = "Eluwina Byku";

        Dog finalDog = ShelterUtils.EXAMPLE_FINAL_DOG;
        Dog anotherDog = ShelterUtils.EXAMPLE_FINAL_DOG;
        System.out.println(finalDog);
        finalDog.setName("Bruno");
        System.out.println(finalDog);
//      Possible although final
        ShelterUtils.EXAMPLE_FINAL_DOG.setName("Maks");
        System.out.println(ShelterUtils.EXAMPLE_FINAL_DOG);


    }


}
