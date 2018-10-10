public class Main {


    public static void main(String[] args) {
        int y;
        int z;

        for (int x = 1; x < 26; x++) {
            y = (int)(Math.random()*10);
            z = (int)(Math.random()*10);

            //System.out.println(y);
            if (y > z) {
                System.out.println("y");
            } else if (y < z) {
                System.out.println("z");
            } else if (y == z) {
                System.out.println("равны");
            }
        }
    }

}
