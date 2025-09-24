
import com.sun.source.tree.InstanceOfTree;

class Wrapper {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("X vale is " + x);
        // System.out.println(x instanceof Integer);

        // the process of converting the primitive to object know as autoboxing
        // we are converting wrapper class integer to int type-> Unboxing
        Integer x1 = 20;
        System.out.println("X1 vale is " + x1);

        // chekc the type of any object
        System.out.println(x1 instanceof Integer);

        Integer x2 = x1 + 20;
        System.out.println("X1 vale is " + x2);

    }
}
