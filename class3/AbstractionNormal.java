
//Abstraction Normal interview me ye nhi karna ->
public class AbstractionNormal {

    public int maxOfTwo(int x, int y) {
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        AbstractionNormal Ab = new AbstractionNormal();
        int res = Ab.maxOfTwo(100, 20);
        System.out.println("Maximum between two no."+res);

    }
}
