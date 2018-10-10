package experiments.incapsulation;

/**
 * Created by Alexey Dvoryaninov on 07.07.2018 - (lexxzone@gmail.com)
 */
public class IncapsulationTestOne {

    private String name;

    private int age;

    public IncapsulationTestOne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        IncapsulationTestOne inc = new IncapsulationTestOne("First One", 16);

        System.out.println(inc.getAge());
        System.out.println(inc.getName());
        System.out.println(inc.name);
    }
}
