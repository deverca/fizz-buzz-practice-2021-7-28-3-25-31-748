package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static  org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number(){
        int orderNumber = 1;

        String result = fizzBuzz.countOff(orderNumber);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_Fizz_when_count_off_given_multiple_by_three_order_number(){
        int orderNumber = 3;
        String result = fizzBuzz.countOff(orderNumber);
        assertThat(result).isEqualTo("Fizz");
    }
}
