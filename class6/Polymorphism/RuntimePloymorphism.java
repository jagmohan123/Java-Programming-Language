
class Parent {

    public void sum(int x, int y) {
        System.out.println("Parent class me hai ===>Sum of 2 no is " + (x + y));
    }
}

class RuntimePloymorphism extends Parent {

    @Override
    public void sum(int x, int y) {
        System.out.println("Runtime class me hai---->Sum of 2 no is " + (x + y));

    }

    public static void main(String args[]) {
        RuntimePloymorphism r1 = new RuntimePloymorphism();
        r1.sum(10, 20);

        // Parent p1 = new Parent();
        // p1.sum(10, 20);

        // Parent class ka object meri child class kee method ko call kare
        Parent p2 = new RuntimePloymorphism();
        p2.sum(10, 20);

    }

}
