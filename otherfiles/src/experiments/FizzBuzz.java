package experiments;

/**
 * Created by Alexey Dvoryaninov on 24.06.2018 - (lexxzone@gmail.com)
 */
public class FizzBuzz {

    public static void main(String[] args) {

        int[] intArray = new int[100];

        for (int i = 0; i < 100; i++) {
            intArray[i] = 1 + i;
        }

        for (int x: intArray) {
            if (x % 3 == 0 && x % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if(x % 5 == 0) {
                System.out.println("Buzz");
            } else if(x % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(x);
            }
        }


        //System.out.println(intArray[99]);
    }
}
