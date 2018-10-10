package patterns.singleton;

/**
 * Created by Alexey Dvoryaninov on 28.06.2018 - (lexxzone@gmail.com)
 */
public class Singleton {
    /**
     *  Шаблон Singleton. Шаблон Java Синглтон позволяет создавать единственный экземпляр класса.
     *  У класса есть только один экземпляр, и он предоставляет к нему глобальную точку доступа.
     */

    private static Singleton instance;

    private Singleton () {}

    private static Singleton getInstance () {

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }



}
