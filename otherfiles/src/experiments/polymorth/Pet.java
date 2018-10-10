package experiments.polymorth;

/**
 * Created by Alexey Dvoryaninov on 07.07.2018 - (lexxzone@gmail.com)
 */
public class Pet implements ThisAction {

    String name;
    private int id;

    public Pet(String name) {
        this.name = name;
        this.id = ThisAction.Count.id++;
    }

    public void whoIam(){
        System.out.println("I can't say anything! I'm a dog...");
        System.out.println("My name is " + name + ".");
        System.out.println(id);
    }

    public void say() {
        System.out.println("I'm a " + getClass());
    }

}
