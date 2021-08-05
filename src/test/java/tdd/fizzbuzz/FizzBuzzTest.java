package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number() {
        //given
        int orderNumber = 1;
        //when
        String result = fizzBuzz.countOff(orderNumber);
        //then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_Fizz_when_count_off_given_multiple_by_three_order_number() {
        //given
        int orderNumber = 9;
        //when
        String result = fizzBuzz.countOff(orderNumber);
        //then
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_when_count_off_given_multiple_by_five_order_number() {
        //given
        int orderNumber = 10;
        //when
        String result = fizzBuzz.countOff(orderNumber);
        //then
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void should_return_Whizz_when_count_off_given_multiple_by_seven_order_number() {
        //given
        int orderNumber = 7;
        //when
        String result = fizzBuzz.countOff(orderNumber);
        //then
        assertThat(result).isEqualTo("Whizz");
    }
    @Test
    void should_return_FizzBuzz_when_count_off_given_multiple_by_two_special_order_numbers() {
        //given
        int orderNumber = 21;
        //when
        String result = fizzBuzz.countOff(orderNumber);
        //then
        assertThat(result).isEqualTo("FizzBuzz");
    }


}
