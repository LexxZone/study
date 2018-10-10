package experiments.polymorth;

/**
 * Created by Alexey Dvoryaninov on 07.07.2018 - (lexxzone@gmail.com)
 */
public class RegBook {

    public static void main(String[] args) {
        User Andrew = new User("Andrew");
        Pet dogOne = new Pet("Melvin");
        User Helen = new User("Lena");
        Pet dogTwo = new Pet("Dugg");

        Andrew.whoIam();
        Andrew.say();
        dogOne.whoIam();
        dogOne.say();
        Helen.whoIam();
        Helen.say();
        dogTwo.whoIam();
        dogTwo.say();

    }


}
