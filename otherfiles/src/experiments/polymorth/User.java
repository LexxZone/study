package experiments.polymorth;

/**
 * Created by Alexey Dvoryaninov on 07.07.2018 - (lexxzone@gmail.com)
 */
public class User implements ThisAction {

    String name;
    private int id;

    /**
     * Constuctor by default with parameter
     *
     * @param name - name of User
     */
    public User(String name) {
        this.name = name;
        this.id = ThisAction.Count.id++;
    }

    /**
     * Realised interface method whoIam()
     */
    public void whoIam() {
        System.out.println("My name is " + name + ".");
        System.out.println("My id is " + id);


    }

    /**
     * Realised interface method say()
     */
    public void say() {
        System.out.println("I'm a " + getClass() + ". I'm a man.");

    }
}
