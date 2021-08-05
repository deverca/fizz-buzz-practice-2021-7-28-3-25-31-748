package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number) {
        if(number==3*5||number==3*7||number==5*7){
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }else if(number%7==0){
            return "Whizz";
        }
        return String.valueOf(number);
    }


}
